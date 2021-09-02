package com.telepathicgrunt.biomeadjuster;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("biomeadjuster")
public class Biomeadjuster
{
    private static final Logger LOGGER = LogManager.getLogger();

    public Biomeadjuster() {
        MinecraftForge.EVENT_BUS.addListener(this::adjustBiomes);
    }


    private static final ResourceLocation atmosphericsrainforest =
            new ResourceLocation("atmospheric", "rainforest");

    public void adjustBiomes(BiomeLoadingEvent event) {
        if(event.getName().equals(atmosphericsrainforest)) {
            event.setCategory(Biome.Category.JUNGLE);
        }
    }
}

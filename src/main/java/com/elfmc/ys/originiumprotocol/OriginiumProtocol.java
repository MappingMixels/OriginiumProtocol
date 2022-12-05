package com.elfmc.ys.originiumprotocol;

<<<<<<< ca892b2be6baef236b1d7d707667311d3713c696
import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
=======
import com.elfmc.ys.originiumprotocol.common.item.OPItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
>>>>>>> first item

import java.util.stream.Collectors;

/**
 * @author DustW
 */
@Mod(OriginiumProtocol.ID)
public class OriginiumProtocol {
    public static final String ID = "originiumprotocol";

    public static final CreativeModeTab TAB = new CreativeModeTab(ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(OPItems.PRTS.get());
        }
    };

    public OriginiumProtocol() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        OPItems.ITEMS.register(bus);
    }
}

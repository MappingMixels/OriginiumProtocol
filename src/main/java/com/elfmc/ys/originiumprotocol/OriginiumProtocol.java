package com.elfmc.ys.originiumprotocol;

import com.elfmc.ys.originiumprotocol.common.item.OPItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

/**
 * @author DustW
 */
@Mod(OriginiumProtocol.ID)
public class OriginiumProtocol {
    public static final String ID = "originiumprotocol";

    public static final CreativeModeTab TAB = new CreativeModeTab(ID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(OPItems.PRTS.get());
        }
    };

    private OriginiumProtocol() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        OPItems.ITEMS.register(bus);
    }
}

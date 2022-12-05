package com.elfmc.ys.originiumprotocol.common.item;

import com.elfmc.ys.originiumprotocol.OriginiumProtocol;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @author DustW
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OPItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OriginiumProtocol.ID);

    public static final RegistryObject<Item> PRTS = ITEMS.register("prts", () -> new Item(def().stacksTo(1)));

    private static Item.Properties def() {
        return new Item.Properties().tab(OriginiumProtocol.TAB);
    }
}

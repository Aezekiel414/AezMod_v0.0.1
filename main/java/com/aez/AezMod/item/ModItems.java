package com.aez.AezMod.item;

import com.aez.AezMod.AezMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AezMod.MOD_ID);

    public static final RegistryObject<Item> hb_summon = ITEMS.register("hb_summon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> the_void = ITEMS.register("the_void",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUILDERMAN = ITEMS.register("builderman",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}

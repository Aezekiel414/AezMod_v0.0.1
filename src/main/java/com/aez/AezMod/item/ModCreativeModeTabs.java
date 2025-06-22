package com.aez.AezMod.item;

import com.aez.AezMod.AezMod;
import com.aez.AezMod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AezMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> AEZ_MOD_TAB_BLOCKS = CREATIVE_MODE_TABS.register("aez_mod_tab_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MICROWAVE_BLOCK.get()))
                    .title(Component.translatable("creativetab.aezmod.aez_mod_tab_blocks"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.MICROWAVE_BLOCK.get());
                        pOutput.accept(ModBlocks.the_void_block.get());
                        pOutput.accept(ModBlocks.EI_OAKLOG.get());
                        pOutput.accept(ModBlocks.RUBY_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> AEZ_MOD_TAB_ITEMS = CREATIVE_MODE_TABS.register("aez_mod_tab_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BUILDERMAN.get()))
                    .withTabsBefore(AEZ_MOD_TAB_BLOCKS.getId())
                    .title(Component.translatable("creativetab.aezmod.aez_mod_tab_items"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.hb_summon.get());
                        pOutput.accept(ModItems.the_void.get());
                        pOutput.accept(ModItems.BUILDERMAN.get());
                        pOutput.accept(ModItems.RAW_RUBY.get());
                        pOutput.accept(ModItems.RUBY.get());
            }).build());

    public static void register(IEventBus eventbus) {
        CREATIVE_MODE_TABS.register(eventbus);
    }

}

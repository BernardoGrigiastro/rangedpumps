package com.refinedmods.rangedpumps.setup;

import com.refinedmods.rangedpumps.RangedPumps;
import com.refinedmods.rangedpumps.block.PumpBlock;
import com.refinedmods.rangedpumps.tile.PumpTile;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class CommonSetup {
    @SubscribeEvent
    public void onRegisterBlocks(RegistryEvent.Register<Block> e) {
        e.getRegistry().register(new PumpBlock());
    }

    @SubscribeEvent
    public void onRegisterItems(RegistryEvent.Register<Item> e) {
        e.getRegistry().register(new BlockItem(PumpBlock.BLOCK, new Item.Properties().group(RangedPumps.MAIN_GROUP)).setRegistryName(RangedPumps.ID, "pump"));
    }

    @SubscribeEvent
    public void onRegisterTiles(RegistryEvent.Register<TileEntityType<?>> e) {
        e.getRegistry().register(TileEntityType.Builder.create(() -> new PumpTile(), PumpBlock.BLOCK).build(null).setRegistryName(RangedPumps.ID, "pump"));
    }
}

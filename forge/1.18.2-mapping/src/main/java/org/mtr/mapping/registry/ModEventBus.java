package org.mtr.mapping.registry;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.mtr.mapping.mapper.Block;
import org.mtr.mapping.mapper.BlockEntity;
import org.mtr.mapping.mapper.Item;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

public final class ModEventBus {

	static final Set<Supplier<Block>> BLOCKS = new HashSet<>();
	static final Set<Supplier<Item>> ITEMS = new HashSet<>();
	static final Set<Supplier<BlockEntityType<? extends BlockEntity>>> BLOCK_ENTITY_TYPES = new HashSet<>();

	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<net.minecraft.world.level.block.Block> event) {
		BLOCKS.forEach(supplier -> event.getRegistry().register(supplier.get()));
	}

	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<net.minecraft.world.item.Item> event) {
		ITEMS.forEach(supplier -> event.getRegistry().register(supplier.get()));
	}

	@SubscribeEvent
	public void registerBlockEntityTypes(RegistryEvent.Register<BlockEntityType<?>> event) {
		BLOCK_ENTITY_TYPES.forEach(supplier -> event.getRegistry().register(supplier.get()));
	}
}

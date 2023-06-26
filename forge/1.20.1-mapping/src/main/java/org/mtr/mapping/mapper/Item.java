package org.mtr.mapping.mapper;

import org.mtr.mapping.annotation.MappedMethod;
import org.mtr.mapping.registry.CreativeModeTabHolder;

import java.util.function.Supplier;

public abstract class Item extends net.minecraft.world.item.Item {

	public Item(Properties properties) {
		super(properties.itemSettings);
	}

	public static final class Properties {

		final net.minecraft.world.item.Item.Properties itemSettings;

		@MappedMethod
		public Properties() {
			this.itemSettings = new net.minecraft.world.item.Item.Properties();
		}

		private Properties(net.minecraft.world.item.Item.Properties itemSettings) {
			this.itemSettings = itemSettings;
		}

		@MappedMethod
		public Properties creativeModeTab(CreativeModeTabHolder creativeModeTabHolder, Supplier<Item> itemSupplier) {
			creativeModeTabHolder.itemSuppliers.add(itemSupplier);
			return this;
		}

		@MappedMethod
		public Properties maxCount(int maxCount) {
			return new Properties(itemSettings.stacksTo(maxCount));
		}
	}
}

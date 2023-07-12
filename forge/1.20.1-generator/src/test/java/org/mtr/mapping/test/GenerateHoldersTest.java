package org.mtr.mapping.test;

import net.minecraft.ChatFormatting;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.core.Vec3i;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.chunk.ChunkSource;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.scores.Score;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import org.joml.Vector3f;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public final class GenerateHoldersTest {

	@Test
	public void generate() throws IOException {
		final GenerateHolders generateHolders = new GenerateHolders();
		generateHolders.put("ActionResult", InteractionResult.class);
		generateHolders.put("Axis", Direction.Axis.class);
		generateHolders.put("BlockEntityRendererArgument", BlockEntityRendererProvider.Context.class);
		generateHolders.put("BlockEntityType", BlockEntityType.class);
		generateHolders.put("BlockHitResult", BlockHitResult.class);
		generateHolders.put("BlockPos", BlockPos.class);
		generateHolders.put("BlockState", BlockState.class);
		generateHolders.put("BlockView", BlockGetter.class);
		generateHolders.put("BooleanProperty", BooleanProperty.class);
		generateHolders.put("Box", AABB.class);
		generateHolders.put("ChunkManager", ChunkSource.class);
		generateHolders.put("ClientWorld", ClientLevel.class);
		generateHolders.put("CompoundTag", CompoundTag.class);
		generateHolders.put("Direction", Direction.class);
		generateHolders.put("DirectionProperty", DirectionProperty.class);
		generateHolders.put("EntityType", EntityType.class);
		generateHolders.put("EnumProperty", EnumProperty.class);
		generateHolders.put("Explosion", Explosion.class);
		generateHolders.put("FluidState", FluidState.class);
		generateHolders.put("Hand", InteractionHand.class);
		generateHolders.put("HeightMapType", Heightmap.Types.class);
		generateHolders.put("IntegerProperty", IntegerProperty.class);
		generateHolders.put("ItemPlacementContext", BlockPlaceContext.class);
		generateHolders.put("ItemStack", ItemStack.class);
		generateHolders.put("ItemUsageContext", UseOnContext.class);
		generateHolders.put("LivingEntity", LivingEntity.class);
		generateHolders.put("MathHelper", Mth.class);
		generateHolders.put("Mirror", Mirror.class);
		generateHolders.put("MutableText", MutableComponent.class);
		generateHolders.put("OrderedText", FormattedCharSequence.class);
		generateHolders.put("PacketBuffer", FriendlyByteBuf.class);
		generateHolders.put("PlayerEntity", Player.class);
		generateHolders.put("Position", Position.class);
		generateHolders.put("Property", Property.class);
		generateHolders.put("Random", RandomSource.class);
		generateHolders.put("ResourceLocation", ResourceLocation.class);
		generateHolders.put("Rotation", Rotation.class);
		generateHolders.put("Scoreboard", Scoreboard.class);
		generateHolders.put("ScoreboardCriterion", ObjectiveCriteria.class);
		generateHolders.put("ScoreboardCriterionRenderType", ObjectiveCriteria.RenderType.class);
		generateHolders.put("ScoreboardObjective", Objective.class);
		generateHolders.put("ScoreboardPlayerScore", Score.class);
		generateHolders.put("ServerPlayerEntity", ServerPlayer.class);
		generateHolders.put("ServerWorld", ServerLevel.class);
		generateHolders.put("ServerWorldAccess", ServerLevelAccessor.class);
		generateHolders.put("ShapeContext", CollisionContext.class);
		generateHolders.put("SoundCategory", SoundSource.class);
		generateHolders.put("SoundEvent", SoundEvent.class);
		generateHolders.put("Team", PlayerTeam.class);
		generateHolders.put("Text", Component.class);
		generateHolders.put("TextFormatting", ChatFormatting.class);
		generateHolders.put("TooltipContext", TooltipFlag.class);
		generateHolders.put("Vector3d", Vec3.class);
		generateHolders.put("Vector3f", Vector3f.class);
		generateHolders.put("Vector3i", Vec3i.class);
		generateHolders.put("VoxelShape", VoxelShape.class);
		generateHolders.put("VoxelShapes", Shapes.class);
		generateHolders.put("World", Level.class);
		generateHolders.put("WorldAccess", LevelAccessor.class);
		generateHolders.put("WorldChunk", LevelChunk.class);
		generateHolders.putAbstract("Block", Block.class);
		generateHolders.putAbstract("BlockEntity", BlockEntity.class);
		generateHolders.putAbstract("BlockItem", BlockItem.class);
		generateHolders.putAbstract("Entity", Entity.class);
		generateHolders.putAbstract("Item", Item.class);
		generateHolders.putAbstract("SlabBlock", SlabBlock.class);
		generateHolders.generate();
	}
}

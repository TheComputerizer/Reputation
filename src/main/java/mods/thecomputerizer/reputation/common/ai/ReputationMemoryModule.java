package mods.thecomputerizer.reputation.common.ai;

import com.mojang.serialization.Codec;
import mods.thecomputerizer.reputation.common.ModDefinitions;
import net.minecraft.world.entity.ai.memory.MemoryModuleType;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Optional;

public class ReputationMemoryModule<U> extends MemoryModuleType<U> {

    public static final DeferredRegister<MemoryModuleType<?>> MEMORY_MODULES = DeferredRegister.create(ForgeRegistries.MEMORY_MODULE_TYPES, ModDefinitions.MODID);
    public static final RegistryObject<MemoryModuleType<Player>> NEAREST_PLAYER_BAD_REPUTATION = MEMORY_MODULES.register("nearest_player_bad_reputation", () -> new MemoryModuleType<>(Optional.empty()));
    public static final RegistryObject<MemoryModuleType<Player>> NEAREST_PLAYER_NEUTRAL_REPUTATION = MEMORY_MODULES.register("nearest_player_neutral_reputation", () -> new MemoryModuleType<>(Optional.empty()));
    public static final RegistryObject<MemoryModuleType<Player>> NEAREST_PLAYER_GOOD_REPUTATION = MEMORY_MODULES.register("nearest_player_good_reputation", () -> new MemoryModuleType<>(Optional.empty()));

    public ReputationMemoryModule(Optional<Codec<U>> codec) {
        super(codec);
    }
}

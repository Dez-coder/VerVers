package ru.dez.vexvers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.util.KeyDispatchDataCodec;
import net.minecraft.world.level.levelgen.DensityFunction;

/**
 * Density function "vexvers:radial": horizontal distance from the world origin divided by "radius".
 * 0 in the centre, 1 at "radius" blocks away. Used to shape one huge island surrounded by ocean.
 */
public record RadialDensity(double radius) implements DensityFunction.SimpleFunction {
    public static final MapCodec<RadialDensity> DATA_CODEC = RecordCodecBuilder.mapCodec(
        instance -> instance.group(
                Codec.doubleRange(1.0, 1.0E7).fieldOf("radius").forGetter(RadialDensity::radius)
            )
            .apply(instance, RadialDensity::new)
    );
    public static final KeyDispatchDataCodec<RadialDensity> CODEC = KeyDispatchDataCodec.of(DATA_CODEC);

    @Override
    public double compute(DensityFunction.FunctionContext context) {
        double x = (double) context.blockX();
        double z = (double) context.blockZ();
        return Math.sqrt(x * x + z * z) / this.radius;
    }

    @Override
    public double minValue() {
        return 0.0;
    }

    @Override
    public double maxValue() {
        return 5.0E7 / this.radius;
    }

    @Override
    public KeyDispatchDataCodec<? extends DensityFunction> codec() {
        return CODEC;
    }
}

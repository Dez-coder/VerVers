package ru.dez.vexvers;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.RegisterEvent;

/** Registers custom world generation types of this mod. */
@EventBusSubscriber(modid = VexVers.MODID)
public class ModWorldgen {
    @SubscribeEvent
    static void register(RegisterEvent event) {
        event.register(
            Registries.DENSITY_FUNCTION_TYPE,
            Identifier.fromNamespaceAndPath(VexVers.MODID, "radial"),
            () -> RadialDensity.DATA_CODEC
        );
    }
}

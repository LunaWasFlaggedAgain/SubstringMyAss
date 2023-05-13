package com.github.lunawasflaggedagain.substringmyass.mixin;

import net.minecraft.util.StringHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(StringHelper.class)
public class StringHelperMixin {
    @Inject(method = "Lnet/minecraft/util/StringHelper;truncateChat(Ljava/lang/String;)Ljava/lang/String;", at = @At("HEAD"), cancellable = true)

    private static void truncateChat(String text, CallbackInfoReturnable<String> cir) {
        cir.setReturnValue(text);
    }
}

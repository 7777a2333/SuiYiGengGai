package github._7777a2333_.suiyigenggai.mixin;

import github._7777a2333_.suiyigenggai.SuiYiGengGaiMain;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class SuiYiGengGaiMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		SuiYiGengGaiMain.LOGGER.info("This line is printed by an example mod mixin!");
	}
}

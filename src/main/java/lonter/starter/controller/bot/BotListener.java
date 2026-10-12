package lonter.starter.controller.bot;

import lombok.AllArgsConstructor;

import lonter.bat.batobjs.*;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

@Component @AllArgsConstructor
public final class BotListener extends BatListenerAdapter {
  @Override public void onMessageReceived(final @NotNull BatMRE e) { }
  @Override public void onServerReady(final @NotNull String source) { }
  @Override public void onMessageReaction(final @NotNull BatGRE e) { }
  @Override public void onMemberJoinLeave(final @NotNull BatGGE e) { }
  @Override public void onServerMemberRoleChange(final @NotNull BatRCE e) { }
}
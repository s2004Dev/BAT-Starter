package it.lonter.starter.controller.bot.definition;

import lombok.AllArgsConstructor;
import lombok.val;

import it.lonter.bat.wrappers.fluxer.FluxerBotListener;
import it.lonter.bat.wrappers.fluxer.FluxerShard;
import it.lonter.starter.controller.bot.CustomSharedResources;
import it.lonter.jfa.api.OnlineStatus;
import it.lonter.jfa.api.requests.GatewayIntent;
import it.lonter.jfa.api.sharding.DefaultShardManagerBuilder;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

// If you don't plant on having a Fluxer bot, you can safely remove this class.
@Service @AllArgsConstructor
public final class FluxerBot {
  private static final String SOURCE = "fluxer";

  private final Logger log = LoggerFactory.getLogger(getClass());

  private final FluxerBotListener listener;
  private final CustomSharedResources shared;

  @EventListener(ApplicationReadyEvent.class)
  private void start() {
    // Uncomment this code in case you want to enable the logger feature.
    // shared.initServer(SOURCE);

    try {
      val shard = DefaultShardManagerBuilder
        // You will need to provide the token yourself in case you want to remove the shared component.
        .createDefault(shared.getValue(SOURCE, "token"))
        .setStatus(OnlineStatus.ONLINE)
        .enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MEMBERS)
        .build();

      shared.setShard(SOURCE, new FluxerShard(shard));
      shard.addEventListener(listener);
    }

    catch(final @NotNull Exception e) {
      log.error("{} application threw an exception: ", SOURCE, e);
      System.exit(-1);
    }
  }
}
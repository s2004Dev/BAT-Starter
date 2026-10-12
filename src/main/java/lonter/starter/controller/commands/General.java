package lonter.starter.controller.commands;

import lombok.AllArgsConstructor;

import lonter.bat.annotations.Command;
import lonter.bat.annotations.CommandClass;
import lonter.bat.annotations.help.Help;
import lonter.bat.annotations.parameters.ats.Event;
import lonter.bat.batobjs.BatMRE;

import org.jetbrains.annotations.NotNull;

@CommandClass @AllArgsConstructor
public final class General {
  @Command @Help(description = "The bot will send its current latency.")
  public @NotNull String ping(final @Event @NotNull BatMRE e) {
    return "Pong! My ping is: **" + e.bat.getPing() + "ms**.";
  }
}
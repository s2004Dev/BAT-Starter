package it.lonter.starter.controller.commands;

import it.lonter.bat.annotations.Command;
import it.lonter.bat.annotations.CommandClass;
import it.lonter.bat.annotations.help.Help;
import it.lonter.bat.annotations.parameters.ats.Event;
import it.lonter.bat.batobjs.BatMRE;

import org.jetbrains.annotations.NotNull;

@CommandClass
public final class General {
  @Command @Help(description = "The bot will send its current latency.")
  public @NotNull String ping(final @Event @NotNull BatMRE e) {
    return "Pong! My ping is: **" + e.bat.getPing() + "ms**.";
  }

  // You can add your own commands here.
}
package lonter.starter.controller.bot;

import lonter.bat.SharedResources;

import org.jetbrains.annotations.NotNull;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

// This class is optional, if you don't need it, you can remove it; however, you will need to inject the token
// inside the bot definition class yourself and the logger feature won't work.
@Service
public final class CustomSharedResources extends SharedResources {
  public CustomSharedResources(final @NotNull Environment env) {
    super(env);
  }
}
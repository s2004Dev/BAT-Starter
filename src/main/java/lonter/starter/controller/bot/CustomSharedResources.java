package lonter.starter.controller.bot;

import lonter.bat.SharedResources;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public final class CustomSharedResources extends SharedResources {
  @Autowired
  public CustomSharedResources(final @NotNull Environment env) {
    super(env);
  }
}
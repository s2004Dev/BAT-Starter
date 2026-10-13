package lonter.starter;

import org.jetbrains.annotations.NotNull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages = {
  "lonter.starter", // <- Your actual package here.
  "lonter.bat"
})

public class Starter {
  static void main(final String @NotNull[] args) {
    SpringApplication.run(Starter.class, args);
  }
}
package lonter.starter;

import lombok.val;

import org.jetbrains.annotations.NotNull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages = {
  "lonter.starter",
  "lonter.bat"
})

public class Starter {
  static void main(final String @NotNull[] args) {
    val app = new SpringApplication(Starter.class);

    app.setWebApplicationType(WebApplicationType.NONE);
    app.run(args);
  }
}
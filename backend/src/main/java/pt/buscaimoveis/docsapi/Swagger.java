package pt.buscaimoveis.docsapi;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Swagger {

  @Bean
  public OpenAPI customOpenAPI() {
    return new OpenAPI()
            .info(new Info().title("Busca Imóveis API").version("1.0"))
            .addServersItem(new Server().url("https://buscaimoveisapi.pt"));
  }
}

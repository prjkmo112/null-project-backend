package com.momo.nullprj.mainapi.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Null Project API Documents",
                version = "0.0.1",
                description = "API docs about Null Project"
        ),
        servers = {
                @Server(url = "http://localhost:8020", description = "개발 테스트용 서버")
        }
)
public class SwaggerConfig {
}

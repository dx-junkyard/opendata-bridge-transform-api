package com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
@ConfigurationProperties(prefix = "springdoc.extension")
@RequiredArgsConstructor
public class SwaggerConfig {

    @NotNull
    private final String title;

    @NotNull
    private final String version;

    @NotNull
    private final String description;

//    @NotNull
//    private final String host;

    /**
     * OpenAPI configuration.
     *
     * @return OpenAPI configuration
     */
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
//                .servers(List.of(
//                        new Server()
//                                .url(host)))
                .info(new Info()
                        .title(title)
                        .version(version)
                        .description(description));
    }
}

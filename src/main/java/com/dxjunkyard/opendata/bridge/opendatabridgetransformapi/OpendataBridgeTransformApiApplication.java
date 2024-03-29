package com.dxjunkyard.opendata.bridge.opendatabridgetransformapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class OpendataBridgeTransformApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpendataBridgeTransformApiApplication.class, args);
    }

}

package com.spinozanose.examples.micronautrestoo;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
        info = @Info(
                title = "micronaut-rest-oo",
                version = "0.0.1",
                description = "Micronaut REST API",
                license = @License(name = "Apache 2.0", url = "https://spinozanose.com"),
                contact = @Contact(url = "https://spinozanose.com", name = "Aidan", email = "aidan@spinozanose.com")
        )
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}

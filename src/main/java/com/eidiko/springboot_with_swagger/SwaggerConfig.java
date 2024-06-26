package com.eidiko.springboot_with_swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(title = "swagger basic example",
        description = "this api is for student info",
        termsOfService = "All The Terms and condition applied ...",
        contact = @Contact(name = "developedByAdil",
        email="adil@gmail.com",
        url = "adil.com"),
                license = @License(name = "Adil Raza"

                ),
                version = "Api/V1"
),
        servers ={ @Server(description = "testEnv",url = "localhost:8081"),
        @Server(description = "devEnv",url = "localhost:8081")}

)

@SecurityScheme(
        type = SecuritySchemeType.HTTP,
        name = "androSecurity", in = SecuritySchemeIn.HEADER,
bearerFormat = "Bearer",
        description = "this is my basic security"
)
public class SwaggerConfig {

}

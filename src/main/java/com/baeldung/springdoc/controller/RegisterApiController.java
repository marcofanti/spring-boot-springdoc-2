package com.baeldung.springdoc.controller;


import com.baeldung.springdoc.model.Audience;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import com.baeldung.springdoc.openapitools.models.RegisterParameters;
import com.baeldung.springdoc.openapitools.models.RegisterResponse;
import com.baeldung.springdoc.repository.AudienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("${openapi.streamManagementAPIForOpenIDSharedSecurityEvents.base-path:}")
public class RegisterApiController {
    @Autowired
    AudienceRepository audienceRepository;

    @Operation(
        operationId = "register",
        summary = "Request the transmitter to setup a stream for a given receiver.",
        description = "This endpoint is not part of the spec, but rather a quick-and-dirty way to allow a receiver to pass along its audience claim in exchange for a bearer token.",
        tags = {"OutOfBand"},
        responses = {
            @ApiResponse(responseCode = "200", description = "On successful creation of a stream, returns a bearer token that will be used for subsequent requests.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RegisterResponse.class))
            })
        }
    )

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<RegisterResponse> register(

        @Parameter(name = "RegisterParameters", description = "", required = true) @Valid @RequestBody RegisterParameters registerParameters,
        @RequestHeader(name = "Accept", required = true) Map<String, String> headers,
        HttpServletResponse response
    ) {

        URI audienceURI = registerParameters.getAudience();
        if (audienceURI == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Audience audience = audienceRepository.findByName(audienceURI.toString());
        if (audience == null) {
            UUID uuid = UUID.randomUUID();
            audience = new Audience(uuid.toString(), audienceURI.toString(), uuid.toString());
            audienceRepository.save(audience);
            response.addHeader("Content-Type", "application/json");
            RegisterResponse registerResponse = new RegisterResponse();
            registerResponse.setToken(uuid.toString());
            return new ResponseEntity<>(registerResponse, HttpStatus.CREATED);
        } else {

            String token = audience.getToken();
            String exampleString = "{ \"token\" : \"" + token + "\" }";
            response.addHeader("Content-Type", "application/json");
            RegisterResponse registerResponse = new RegisterResponse();
            registerResponse.setToken(token);
            return new ResponseEntity<>(registerResponse, HttpStatus.CREATED);
        }
    }
}

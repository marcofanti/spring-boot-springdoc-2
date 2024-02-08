package com.baeldung.springdoc.controller;


import com.baeldung.springdoc.model.Audience;
import com.baeldung.springdoc.model.Book;
import com.baeldung.springdoc.openapitools.models.RegisterParameters;
import com.baeldung.springdoc.openapitools.models.RegisterResponse;
import com.baeldung.springdoc.openapitools.models.TransmitterConfiguration;
import com.baeldung.springdoc.repository.AudienceRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
//@RequestMapping("${openapi.streamManagementAPIForOpenIDSharedSecurityEvents.base-path:}")
@Validated
@Tag(name = "StreamManagement", description = "[Spec](https://openid.net/specs/openid-sse-framework-1_0.html#management) Stream Management endpoints provided by an Event Transmitter so that Event Transmitters may configure Event Streams.")
public class WellKnownApiController {
    //@Value( "${well.known.url:https://localhost:9000}" )
    String wellKnownIssuerUrl = "https://most-secure.com";
    String wellKnownTransmitterUrl = "https://transmitter.most-secure.com";

    @Autowired
    AudienceRepository audienceRepository;

    /**
     * GET /.well-known/sse-configuration : Transmitter Configuration Request (without path)
     * Return Transmitter Configuration information.
     *
     * @return A set of Claims about the Transmitter&#39;s configuration, including all necessary endpoints and public key location information  (status code 200)
     */
    @Operation(
        operationId = "wellKnownSsfConfigurationGet",
        summary = "Transmitter Configuration Request (without path)",
        description = "Return Transmitter Configuration information.",
        tags = {"StreamManagement"},
        responses = {
            @ApiResponse(responseCode = "200", description = "A set of Claims about the Transmitter's configuration, including all necessary endpoints and public key location information ", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TransmitterConfiguration.class))
            })
        }
    )
    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book patchBook(@PathVariable("id") final String id, @RequestBody final Book book) {
        return book;
    }

    @GetMapping("/.well-known/sse-configuration/{issuer}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<TransmitterConfiguration> wellKnownConfiguration (
        @PathVariable("issuer") final String issuer,
        @RequestHeader(name = "Accept", required = true) Map<String, String> headers) {
        return wellKnownConfiguration(headers);
    }
        @GetMapping("/.well-known/sse-configuration")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<TransmitterConfiguration> wellKnownConfiguration (

        //@Parameter(name = "RegisterParameters", description = "", required = true) @Valid @RequestBody RegisterParameters registerParameters,
        @RequestHeader(name = "Accept", required = true) Map<String, String> headers
        //HttpServletResponse response
    ) {
        // TransmitterConfiguration(URI issuer, URI jwksUri)
        TransmitterConfiguration transmitterConfiguration =
            new TransmitterConfiguration(URI.create(wellKnownIssuerUrl), URI.create(wellKnownTransmitterUrl + "/jwks.json"));
        transmitterConfiguration.setIssuer(URI.create(wellKnownIssuerUrl));
        transmitterConfiguration.setConfigurationEndpoint(URI.create(wellKnownTransmitterUrl + "/stream"));
        transmitterConfiguration.setStatusEndpoint(URI.create(wellKnownTransmitterUrl + "/status"));
        transmitterConfiguration.setAddSubjectEndpoint(URI.create(wellKnownTransmitterUrl + "/add-subject"));
        transmitterConfiguration.setVerificationEndpoint(URI.create(wellKnownTransmitterUrl + "/verification"));
        transmitterConfiguration.setRemoveSubjectEndpoint(URI.create(wellKnownTransmitterUrl + "/remove-subject"));
        List<URI> deliveryMethodsSupported = List.of(
            URI.create("https://schemas.openid.net/secevent/risc/delivery-method/poll"),
            URI.create("https://schemas.openid.net/secevent/risc/delivery-method/push")
        );
        transmitterConfiguration.setDeliveryMethodsSupported(deliveryMethodsSupported);
        transmitterConfiguration.setCriticalSubjectMembers(List.of("tenant", "user"));
        //transmitterConfiguration.
        return new ResponseEntity<>(transmitterConfiguration, HttpStatus.OK);
    }
}

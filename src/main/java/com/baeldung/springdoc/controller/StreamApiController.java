package com.baeldung.springdoc.controller;


import com.baeldung.springdoc.model.Audience;
import com.baeldung.springdoc.openapitools.models.RegisterParameters;
import com.baeldung.springdoc.openapitools.models.RegisterResponse;
import com.baeldung.springdoc.repository.AudienceRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("${openapi.streamManagementAPIForOpenIDSharedSecurityEvents.base-path:}")
@Tag(name = "StreamManagement", description = "[Spec](https://openid.net/specs/openid-sse-framework-1_0.html#management) Stream Management endpoints provided by an Event Transmitter so that Event Transmitters may configure Event Streams.")
public class StreamApiController {
//    @Autowired
//    AudienceRepository audienceRepository;

    /**
     * DELETE /stream : Request to remove the configuration of an event stream
     * An Event Receiver removes the configuration of a stream by making an HTTP DELETE request to the Configuration Endpoint. On receiving a request the Event Transmitter responds with a 200 OK response if the configuration was successfully removed.
     *
     * @return On receiving a request the Event Transmitter responds with a 200 OK response if the configuration was successfully removed. (status code 200)
     *         or Authorization failed or is missing (status code 401)
     *         or The Event Receiver is not allowed to update the stream configuration. (status code 403)
     */
    @Operation(
        operationId = "streamDelete",
        summary = "Request to remove the configuration of an event stream",
        description = "An Event Receiver removes the configuration of a stream by making an HTTP DELETE request to the Configuration Endpoint. On receiving a request the Event Transmitter responds with a 200 OK response if the configuration was successfully removed.",
        tags = { "StreamManagement" },
        responses = {
            @ApiResponse(responseCode = "200", description = "On receiving a request the Event Transmitter responds with a 200 OK response if the configuration was successfully removed."),
            @ApiResponse(responseCode = "401", description = "Authorization failed or is missing", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "403", description = "The Event Receiver is not allowed to update the stream configuration.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        security = {
            @SecurityRequirement(name = "BearerAuth")
        }
    )
    @DeleteMapping("/stream")
    public ResponseEntity<Void> register() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}

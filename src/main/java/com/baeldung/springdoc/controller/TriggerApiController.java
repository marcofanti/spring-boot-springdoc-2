package com.baeldung.springdoc.controller;


import com.baeldung.springdoc.openapitools.models.TriggerEventParameters;
import com.baeldung.springdoc.repository.AudienceRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
//@RequestMapping("${openapi.streamManagementAPIForOpenIDSharedSecurityEvents.base-path:}")
@Validated
@Tag(name = "OutOfBand", description = "Endpoints that are NOT a part of the [Open ID Spec](https://openid.net/specs/openid-sse-framework-1_0.html), but that exist for convenience within this demo.")
public class TriggerApiController {
    @Autowired
    AudienceRepository audienceRepository;

    /**
     * POST /trigger-event : Request the transmitter to create a SSE event of certain type and subject and send it to the (streams)receivers that care about the subject.
     * This endpoint is not part of the spec, but rather a quick-and-dirty way to  test out sample security events other than verification.
     *
     * @param triggerEventParameters  (required)
     * @return On successful creation of an event, it will be sent out as per SSE spec (i.e. push or poll). (status code 200)
     */
    @Operation(
        operationId = "triggerEvent",
        summary = "Request the transmitter to create a SSE event of certain type and subject and send it to the (streams)receivers that care about the subject.",
        description = "This endpoint is not part of the spec, but rather a quick-and-dirty way to  test out sample security events other than verification.",
        tags = { "OutOfBand" },
        responses = {
            @ApiResponse(responseCode = "200", description = "On successful creation of an event, it will be sent out as per SSE spec (i.e. push or poll).")
        }
    )

    @PostMapping("/trigger-event")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Void> triggerEvent(

        @Parameter(name = "TriggerEventParameters", description = "", required = true) @Valid @RequestBody TriggerEventParameters triggerEventParameters,
        @RequestHeader(name = "Accept", required = true) Map<String, String> headers,
        HttpServletResponse response
    ) {
/*
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
            return new ResponseEntity<>(registerResponse, HttpStatus.CREATED); */
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }
}

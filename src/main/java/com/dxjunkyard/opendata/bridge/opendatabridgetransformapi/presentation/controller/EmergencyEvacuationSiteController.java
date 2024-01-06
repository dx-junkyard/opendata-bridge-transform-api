package com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.presentation.controller;

import com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.domain.model.opendata.standard.EmergencyEvacuationSite;
import com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.presentation.dto.builder.EmergencyEvacuationSiteResponseBuilder;
import com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.presentation.dto.form.EmergencyEvacuationSiteListRequestBody;
import com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.presentation.dto.form.EmergencyEvacuationSiteRequestBody;
import com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.presentation.dto.response.EmergencyEvacuationSiteListResponse;
import com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.presentation.dto.response.EmergencyEvacuationSiteResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/v1/emergency-evacuation-site")
@RequiredArgsConstructor
public class EmergencyEvacuationSiteController {

    private final EmergencyEvacuationSiteResponseBuilder responseBuilder;

    @Operation(
            description = "Search OpenData.",
            tags = {"opendata"}
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Success",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = EmergencyEvacuationSiteListResponse.class)
                    )
            ),
    })
    @PostMapping("/transform")
    public Mono<EmergencyEvacuationSiteListResponse> transform(@Validated @RequestBody EmergencyEvacuationSiteListRequestBody requestBody) {

        final List<EmergencyEvacuationSite> emergencyEvacuationSites = requestBody.toEmergencyEvacuationSiteList();

        final List<EmergencyEvacuationSiteResponse> siteResponseList = emergencyEvacuationSites.stream()
                .map(responseBuilder::build).toList();

        return Mono.just(new EmergencyEvacuationSiteListResponse(siteResponseList));
    }

}

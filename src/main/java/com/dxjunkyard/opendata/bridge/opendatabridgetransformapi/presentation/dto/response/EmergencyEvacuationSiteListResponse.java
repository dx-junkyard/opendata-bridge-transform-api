package com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.presentation.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

public record EmergencyEvacuationSiteListResponse(
        @Schema(description = "緊急避難場所の一覧") List<EmergencyEvacuationSiteResponse> sites) {

}

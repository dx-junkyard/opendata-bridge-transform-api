package com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.presentation.dto.form;

import com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.domain.model.opendata.standard.EmergencyEvacuationSite;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.lang.NonNull;

import java.util.List;

@Schema(description = "指定緊急避難場所の一覧")
public record EmergencyEvacuationSiteListRequestBody(
        @Schema(description = "緊急避難場所の一覧") @NonNull List<EmergencyEvacuationSiteRequestBody> emergencyEvacuationSiteList) {

    /**
     * 緊急避難場所の一覧をドメインモデルに変換する
     *
     * @return 緊急避難場所の一覧
     */
    @NonNull
    public List<EmergencyEvacuationSite> toEmergencyEvacuationSiteList() {
        return emergencyEvacuationSiteList.stream()
                .map(EmergencyEvacuationSiteRequestBody::toEmergencyEvacuationSite)
                .toList();
    }
}


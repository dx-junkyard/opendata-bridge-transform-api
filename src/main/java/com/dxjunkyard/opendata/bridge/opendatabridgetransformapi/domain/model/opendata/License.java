package com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.domain.model.opendata;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;

@RequiredArgsConstructor
@Getter
public enum License {
    CC_BY_4_0("CC BY 4.0"),
    ;

    @NonNull
    private final String label;
}

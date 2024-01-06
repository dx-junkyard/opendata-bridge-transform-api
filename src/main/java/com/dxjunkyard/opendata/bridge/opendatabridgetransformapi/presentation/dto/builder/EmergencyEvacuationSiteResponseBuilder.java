package com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.presentation.dto.builder;

import com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.domain.model.opendata.standard.EmergencyEvacuationSite;
import com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.presentation.dto.response.EmergencyEvacuationSiteResponse;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class EmergencyEvacuationSiteResponseBuilder {

    /**
     * 指定緊急避難場所の情報をレスポンスに変換する
     *
     * @param emergencyEvacuationSite 指定緊急避難場所の情報
     * @return 指定緊急避難場所の情報のレスポンス
     */
    @NonNull
    public EmergencyEvacuationSiteResponse build(final EmergencyEvacuationSite emergencyEvacuationSite) {
        return EmergencyEvacuationSiteResponse.builder()
                .localGovCode(emergencyEvacuationSite.getLocalGovCode())
                .id(emergencyEvacuationSite.getId())
                .name(emergencyEvacuationSite.getName())
                .nameKana(emergencyEvacuationSite.getNameKana())
                .nameEnglish(emergencyEvacuationSite.getNameEnglish())
                .addressCode(emergencyEvacuationSite.getAddressCode())
                .townId(emergencyEvacuationSite.getTownId())
                .address(emergencyEvacuationSite.getAddress())
                .prefecture(emergencyEvacuationSite.getPrefecture())
                .city(emergencyEvacuationSite.getCity())
                .town(emergencyEvacuationSite.getTown())
                .addressDetail(emergencyEvacuationSite.getAddressDetail())
                .buildingInfo(emergencyEvacuationSite.getBuildingInfo())
                .postalCode(emergencyEvacuationSite.getPostalCode())
                .latitude(emergencyEvacuationSite.getLatitudeString())
                .longitude(emergencyEvacuationSite.getLongitudeString())
                .altitude(emergencyEvacuationSite.getAltitudeString())
                .phoneNumber(emergencyEvacuationSite.getPhoneNumber())
                .extensionNumber(emergencyEvacuationSite.getExtensionNumber())
                .emailAddress(emergencyEvacuationSite.getEmailAddress())
                .formUrl(emergencyEvacuationSite.getFormUrl())
                .contactRemarks(emergencyEvacuationSite.getContactRemarks())
                .postalCode(emergencyEvacuationSite.getPostalCode())
                .cityCode(emergencyEvacuationSite.getCityCode())
                .organizationName(emergencyEvacuationSite.getOrganizationName())
                .disasterFlood(emergencyEvacuationSite.getDisasterFloodString())
                .disasterLandslide(emergencyEvacuationSite.getDisasterLandslideString())
                .disasterHighTide(emergencyEvacuationSite.getDisasterHighTideString())
                .disasterEarthquake(emergencyEvacuationSite.getDisasterEarthquakeString())
                .disasterTsunami(emergencyEvacuationSite.getDisasterTsunamiString())
                .disasterLargeFire(emergencyEvacuationSite.getDisasterLargeFireString())
                .disasterInlandWaterFlooding(emergencyEvacuationSite.getDisasterInlandWaterFloodingString())
                .disasterVolcanicPhenomenon(emergencyEvacuationSite.getDisasterVolcanicPhenomenonString())
                .overlapWithShelter(emergencyEvacuationSite.getOverlapWithShelterString())
                .capacity(emergencyEvacuationSite.getCapacityString())
                .targetCommunities(emergencyEvacuationSite.getTargetCommunities())
                .url(emergencyEvacuationSite.getUrlString())
                .image(emergencyEvacuationSite.getImageString())
                .imageLicense(emergencyEvacuationSite.getImageLicenseString())
                .notes(emergencyEvacuationSite.getNotes())
                .build();
    }


}

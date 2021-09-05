/**
 *  Copyright 2012-2017 Gunnar Morling (http://www.gunnarmorling.de/)
 *  and/or other contributors as indicated by the @authors tag. See the
 *  copyright.txt file in the distribution for a full listing of all
 *  contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mapstruct.ap.test.nestedbeans.mixed;

import javax.annotation.Generated;
import org.mapstruct.ap.test.nestedbeans.mixed._target.FishDto;
import org.mapstruct.ap.test.nestedbeans.mixed._target.FishTankWithNestedDocumentDto;
import org.mapstruct.ap.test.nestedbeans.mixed._target.WaterQualityOrganisationDto;
import org.mapstruct.ap.test.nestedbeans.mixed._target.WaterQualityReportDto;
import org.mapstruct.ap.test.nestedbeans.mixed._target.WaterQualityWithDocumentDto;
import org.mapstruct.ap.test.nestedbeans.mixed.source.Fish;
import org.mapstruct.ap.test.nestedbeans.mixed.source.FishTank;
import org.mapstruct.ap.test.nestedbeans.mixed.source.WaterQuality;
import org.mapstruct.ap.test.nestedbeans.mixed.source.WaterQualityReport;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-02-19T16:25:03+0100",
    comments = "version: , compiler: javac, environment: Java 1.8.0_112 (Oracle Corporation)"
)
public class FishTankMapperWithDocumentImpl implements FishTankMapperWithDocument {

    @Override
    public FishTankWithNestedDocumentDto map(FishTank source) {
        if ( source == null ) {
            return null;
        }

        FishTankWithNestedDocumentDto fishTankWithNestedDocumentDto = new FishTankWithNestedDocumentDto();

        fishTankWithNestedDocumentDto.setFish( fishToFishDto( source.getFish() ) );
        fishTankWithNestedDocumentDto.setQuality( waterQualityToWaterQualityWithDocumentDto( source.getQuality() ) );
        fishTankWithNestedDocumentDto.setName( source.getName() );

        return fishTankWithNestedDocumentDto;
    }

    protected FishDto fishToFishDto(Fish fish) {
        if ( fish == null ) {
            return null;
        }

        FishDto fishDto = new FishDto();

        fishDto.setKind( fish.getType() );

        fishDto.setName( "Jaws" );

        return fishDto;
    }

    protected WaterQualityOrganisationDto waterQualityReportToWaterQualityOrganisationDto(WaterQualityReport waterQualityReport) {
        if ( waterQualityReport == null ) {
            return null;
        }

        WaterQualityOrganisationDto waterQualityOrganisationDto = new WaterQualityOrganisationDto();

        waterQualityOrganisationDto.setName( "NoIdeaInc" );

        return waterQualityOrganisationDto;
    }

    protected WaterQualityReportDto waterQualityReportToWaterQualityReportDto(WaterQualityReport waterQualityReport) {
        if ( waterQualityReport == null ) {
            return null;
        }

        WaterQualityReportDto waterQualityReportDto = new WaterQualityReportDto();

        waterQualityReportDto.setVerdict( waterQualityReport.getVerdict() );
        waterQualityReportDto.setOrganisation( waterQualityReportToWaterQualityOrganisationDto( waterQualityReport ) );

        return waterQualityReportDto;
    }

    protected WaterQualityWithDocumentDto waterQualityToWaterQualityWithDocumentDto(WaterQuality waterQuality) {
        if ( waterQuality == null ) {
            return null;
        }

        WaterQualityWithDocumentDto waterQualityWithDocumentDto = new WaterQualityWithDocumentDto();

        waterQualityWithDocumentDto.setDocument( waterQualityReportToWaterQualityReportDto( waterQuality.getReport() ) );

        return waterQualityWithDocumentDto;
    }
}

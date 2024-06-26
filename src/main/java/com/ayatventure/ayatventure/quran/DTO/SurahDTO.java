package com.ayatventure.ayatventure.quran.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SurahDTO {

    private int id;

    @JsonProperty("revelation_place")
    private String revelationPlace;

    @JsonProperty("name_complex")
    private String phoneticName;

    @JsonProperty("name_arabic")
    private String arabicName;

    @JsonProperty("translated_name")
    private Translation translatedName;

    @JsonIgnoreProperties(ignoreUnknown = true)
    private record Translation(String name) {
    }
}

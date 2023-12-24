package com.ayatventure.ayatventure.persistence.http;

import com.ayatventure.ayatventure.model.Ayat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiRandomVerseResponse {

    @JsonProperty("verse")
    private Ayat ayat;
}
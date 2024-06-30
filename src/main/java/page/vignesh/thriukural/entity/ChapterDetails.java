package page.vignesh.thriukural.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ChapterDetails {

    @JsonProperty("name")
    String name;
    @JsonProperty("translation")
    String translation;
    @JsonProperty("transliteration")
    String transliteration;
    @JsonProperty("number")
    String number;
    @JsonProperty("start")
    String start;
    @JsonProperty("end")
    String end;
}

package page.vignesh.thriukural.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ChapterGroupDetails {

    @JsonProperty("name")
    String name;
    @JsonProperty("transliteration")
    String transliteration;
    @JsonProperty("translation")
    String translation;
    @JsonProperty("number")
    int number;
    @JsonProperty("chapters")
    Chapters chapters;
}

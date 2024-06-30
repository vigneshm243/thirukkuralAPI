package page.vignesh.thriukural.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
    @JsonProperty("name")
    String name;
    @JsonProperty("transliteration")
    String transliteration;
    @JsonProperty("translation")
    String translation;
    @JsonProperty("number")
    int number;
    @JsonProperty("chapterGroup")
    ChapterGroup chapterGroup;
}

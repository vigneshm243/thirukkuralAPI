package page.vignesh.thriukural.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class Kural {

    @JsonProperty("Number")
    int number;
    @JsonProperty("Line1")
    String line1;
    @JsonProperty("Line2")
    String line2;
    @JsonProperty("Translation")
    String translation;
    @JsonProperty("mv")
    String mv;
    @JsonProperty("sp")
    String sp;
    @JsonProperty("mk")
    String mk;
    @JsonProperty("explanation")
    String explaination;
    @JsonProperty("couplet")
    String couplet;
    @JsonProperty("transliteration1")
    String transliteration1;
    @JsonProperty("transliteration2")
    String transliteration2;

}

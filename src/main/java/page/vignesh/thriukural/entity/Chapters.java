package page.vignesh.thriukural.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Chapters {

    @JsonProperty("tamil")
    String tamil;
    @JsonProperty("detail")
    List<ChapterDetails> details;

}

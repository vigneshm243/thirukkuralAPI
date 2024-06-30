package page.vignesh.thriukural.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ChapterGroup {
    @JsonProperty("tamil")
    String tamil;
    @JsonProperty("detail")
    List<ChapterGroupDetails> chapterGroupDetails;
}

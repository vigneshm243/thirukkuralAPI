package page.vignesh.thriukural.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.util.ResourceUtils;
import page.vignesh.thriukural.entity.Kural;
import page.vignesh.thriukural.entity.Book;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;


public class DataLoader {
    private static String readJsonFromFile(String filePath) throws IOException, ParseException {
//        String json = Files.readString(Paths.get("file path"));
        String json = Files.readString(ResourceUtils.getFile(ResourceUtils.CLASSPATH_URL_PREFIX + filePath).toPath(), StandardCharsets.UTF_8);
        return new JSONParser().parse(json).toString();
    }


    public static List<Kural> getKuralList() throws IOException, ParseException {
        var kuralFilePath = "static/thirukkural.json";
        String jsonString = readJsonFromFile(kuralFilePath);
        ObjectMapper om = new ObjectMapper();
        CollectionType typeReference =
                TypeFactory.defaultInstance().constructCollectionType(List.class, Kural.class);
        List<Kural> questions =  om.readValue(jsonString, typeReference);
        return questions;
    }

    public static List<Book> getKuralDetails() throws IOException, ParseException {
        var kuralFilePath = "static/detail.json";
        String jsonString = readJsonFromFile(kuralFilePath);
        ObjectMapper om = new ObjectMapper();
        CollectionType typeReference =
                TypeFactory.defaultInstance().constructCollectionType(List.class, Book.class);
        List<Book> details =  om.readValue(jsonString, typeReference);
        System.out.println(details);
        return details;
    }
}

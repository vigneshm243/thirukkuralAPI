package page.vignesh.thriukural.service;

import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;
import page.vignesh.thriukural.entity.Kural;
import page.vignesh.thriukural.entity.Book;

import java.io.IOException;
import java.util.List;

@Service
public class ThirukuralService {

    public static final List<Kural> KURALS;
    public static final List<Book> BOOKS;

    static {
        try {
            KURALS = DataLoader.getKuralList();
            BOOKS = DataLoader.getKuralDetails();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    };

    public Kural getKural(int id) {
        return KURALS.get(id - 1);
    }
    public List<Book> getBooks() {
        return BOOKS;
    }
}

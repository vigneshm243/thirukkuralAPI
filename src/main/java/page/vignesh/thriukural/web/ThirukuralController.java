package page.vignesh.thriukural.web;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import page.vignesh.thriukural.entity.Book;
import page.vignesh.thriukural.entity.Kural;
import page.vignesh.thriukural.service.ThirukuralService;

import java.util.List;
import java.util.logging.Logger;

@RestController

public class ThirukuralController {

    Logger log = Logger.getLogger(getClass().getName());
    @Autowired
    ThirukuralService thirukuralService;

    @GetMapping("/thirukural/{id}")
    public Kural getThirukural(@PathVariable("id") int id) throws InterruptedException {
        Thread.sleep(2000);
        log.info("Running on " + Thread.currentThread());
        return thirukuralService.getKural(id);
    }
    @GetMapping("/books")
    public List<Book> getBooks() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Running on ");
        return thirukuralService.getBooks();
    }
}

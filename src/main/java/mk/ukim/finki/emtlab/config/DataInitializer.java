package mk.ukim.finki.emtlab.config;//package mk.ukim.finki.emtlibrary.config;
/*
import mk.ukim.finki.emtlab.model.Author;
import mk.ukim.finki.emtlab.model.Book;
import mk.ukim.finki.emtlab.model.dto.BookDto;
import mk.ukim.finki.emtlab.model.enums.Category;
import mk.ukim.finki.emtlab.service.AuthorService;
import mk.ukim.finki.emtlab.service.BookService;
import mk.ukim.finki.emtlab.service.CountryService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Optional;
@Component
public class DataInitializer {
    private final BookService bookService;
    private final AuthorService authorService;

    private final CountryService countryService;

    public DataInitializer(BookService bookService, AuthorService authorService, CountryService countryService) {
        this.bookService = bookService;
        this.authorService = authorService;
        this.countryService = countryService;
    }
//
//
@PostConstruct
    public void init(){
        BookDto book1 = new BookDto("The Alchemist", Category.HISTORY,1L,05);
        BookDto book2 = new BookDto("Schindler's List", Category.HISTORY,5L,25);
        BookDto book3 = new BookDto("The Lord of the Rings", Category.FANTASY,9L,26);
        BookDto book6 = new BookDto(" Se7en", Category.THRILER,4L,20);
        BookDto book4 = new BookDto("The Shawshank Redemption", Category.DRAMA,4L,23);BookDto book5 = new BookDto("The Raven", Category.CLASSICS,7L,20);
        BookDto book7 = new BookDto("Gone with the Wind", Category.CLASSICS,9L,16);

        this.bookService.save(book1);
        this.bookService.save(book2);
        this.bookService.save(book3);
        this.bookService.save(book4);
        this.bookService.save(book5);
        this.bookService.save(book6);
        this.bookService.save(book7);
    }
}
*/
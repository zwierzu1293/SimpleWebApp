package spring5WebApp.simple.web.app.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring5WebApp.simple.web.app.domain.Author;
import spring5WebApp.simple.web.app.domain.Book;
import spring5WebApp.simple.web.app.domain.Publisher;
import spring5WebApp.simple.web.app.repository.AuthorRepository;
import spring5WebApp.simple.web.app.repository.BookRepository;
import spring5WebApp.simple.web.app.repository.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in bootsrap");

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design","11111");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Jonson");
        Book noEJB = new Book("J2EE Development withpout EJB","22222");;

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);


        System.out.println("Number of books " + bookRepository.count());

        Publisher random = new Publisher("Marek","Krolewicza Jakuba", "Poland", "02-799");
        publisherRepository.save(random);
    }
}

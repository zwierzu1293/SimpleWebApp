package spring5WebApp.simple.web.app.repository;

import org.springframework.data.repository.CrudRepository;
import spring5WebApp.simple.web.app.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}

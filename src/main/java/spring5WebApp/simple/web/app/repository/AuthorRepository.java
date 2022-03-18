package spring5WebApp.simple.web.app.repository;

import org.springframework.data.repository.CrudRepository;
import spring5WebApp.simple.web.app.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}

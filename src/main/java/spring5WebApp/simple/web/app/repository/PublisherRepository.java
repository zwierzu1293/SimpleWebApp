package spring5WebApp.simple.web.app.repository;

import org.springframework.data.repository.CrudRepository;
import spring5WebApp.simple.web.app.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

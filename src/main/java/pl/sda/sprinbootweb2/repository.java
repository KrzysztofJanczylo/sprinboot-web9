package pl.sda.sprinbootweb2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends CrudRepository<Users, Long> {
}

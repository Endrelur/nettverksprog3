package repo;

import model.AuthorAddress;
import model.AuthorAddressId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorAddressRepo extends CrudRepository<AuthorAddress, AuthorAddressId> {
    List<AuthorAddress> findByAuthorId(Integer authorId);

    List<AuthorAddress> findByAddressId(Integer addressId);
}

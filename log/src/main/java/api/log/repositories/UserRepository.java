package api.log.repositories;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import api.log.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {
    public UserModel findByEmailAndPassword(String email, String password);
    public UserModel findByEmail(String email);

}

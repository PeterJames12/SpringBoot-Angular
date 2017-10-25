package springboot.angular.kino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.angular.kino.model.User;

/**
 * @author Igor Hnes on 10/25/17.
 */
public interface UserRepository extends JpaRepository<User, Long> {


}

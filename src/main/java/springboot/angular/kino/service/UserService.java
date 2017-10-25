package springboot.angular.kino.service;

import org.springframework.stereotype.Service;
import springboot.angular.kino.model.User;

/**
 * @author Igor Hnes on 10/25/17.
 */
@Service
public interface UserService {

    User save(User user);
}

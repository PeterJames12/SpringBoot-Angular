package springboot.angular.kino.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import springboot.angular.kino.model.User;
import springboot.angular.kino.repository.UserRepository;
import springboot.angular.kino.service.UserService;

/**
 * @author Igor Hnes on 10/25/17.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}

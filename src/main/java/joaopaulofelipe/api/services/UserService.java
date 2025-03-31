package joaopaulofelipe.api.services;

import joaopaulofelipe.api.domain.User;

import java.util.List;


public interface UserService {
    User findById(Integer id);

    List<User> findAll();
}

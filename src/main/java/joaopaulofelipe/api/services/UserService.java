package joaopaulofelipe.api.services;

import joaopaulofelipe.api.domain.User;
import joaopaulofelipe.api.domain.dto.UserDTO;

import java.util.List;


public interface UserService {
    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
}

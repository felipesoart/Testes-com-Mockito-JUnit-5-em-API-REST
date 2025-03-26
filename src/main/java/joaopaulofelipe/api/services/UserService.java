package joaopaulofelipe.api.services;

import joaopaulofelipe.api.domain.User;

public interface UserService {
    User findById(Integer id);
}

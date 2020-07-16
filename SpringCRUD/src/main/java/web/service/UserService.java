package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    User find(Long id);
    void save(User user);
    void update(User user);
    void delete(User user);
    List<User> findAll();
}

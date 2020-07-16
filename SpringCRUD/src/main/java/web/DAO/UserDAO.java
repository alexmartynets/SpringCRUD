package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {
        User find(Long id);
        void save(User user);
        void update(User user);
        void delete(User user);
        List<User> findAll();
}
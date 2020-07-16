package web.DAO;

import web.model.User;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class UserDAOImpl implements UserDAO {
    private final SessionFactory sessionFactory;

    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public User find(Long id) {
        return sessionFactory.getCurrentSession().get(User.class, id);
    }

    @Override
    public void save(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void update(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    @Override
    public void delete(User user) {
        sessionFactory.getCurrentSession().delete(user);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> findAll() {
        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("FROM User ");
        return query.getResultList();
    }
}
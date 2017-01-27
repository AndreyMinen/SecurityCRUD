package ru.dronix.seccrud.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.dronix.seccrud.model.User;

/**
 * Created by ADMIN on 13.01.2017.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public User getUserById(int id) {
        Session session=this.sessionFactory.getCurrentSession();
        User user=(User)session.load(User.class,new Integer(id));

        return user;
    }

    public User getByUsername(String username) {
        Session session=this.sessionFactory.getCurrentSession();
        User user=(User)session.createCriteria(User.class).add(Restrictions.eq("username",username)).uniqueResult();

        return user;
    }
}

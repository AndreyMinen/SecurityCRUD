package ru.dronix.seccrud.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.dronix.seccrud.model.Role;

/**
 * Created by ADMIN on 13.01.2017.
 */
@Repository
public class RoleDaoImpl implements RoleDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Role getRoleById(int id) {
        Session session=this.sessionFactory.getCurrentSession();
        Role role=(Role)session.load(Role.class,new Integer(id));

        return role;
    }
}

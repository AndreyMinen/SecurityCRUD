package ru.dronix.seccrud.dao;

import ru.dronix.seccrud.model.User;

/**
 * Created by ADMIN on 13.01.2017.
 */
public interface UserDao {
    User getUserById(int id);
    User getByUsername(String username);
}

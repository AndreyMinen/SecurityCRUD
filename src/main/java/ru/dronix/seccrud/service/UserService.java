package ru.dronix.seccrud.service;

import ru.dronix.seccrud.model.User;

/**
 * Created by ADMIN on 13.01.2017.
 */
public interface UserService {
    User getByUsername(String username);
}

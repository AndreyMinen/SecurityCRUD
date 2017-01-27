package ru.dronix.seccrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dronix.seccrud.dao.UserDao;
import ru.dronix.seccrud.model.User;

/**
 * Created by ADMIN on 13.01.2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public User getByUsername(String username) {
        return this.userDao.getByUsername(username);
    }
}

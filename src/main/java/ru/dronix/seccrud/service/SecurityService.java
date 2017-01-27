package ru.dronix.seccrud.service;

/**
 * Created by ADMIN on 13.01.2017.
 */
public interface SecurityService {
    String findLoggedInUsername();
    void autoLogin(String username,String password);
}

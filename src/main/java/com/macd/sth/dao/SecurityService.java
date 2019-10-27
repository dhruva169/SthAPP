package com.macd.sth.dao;



public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}



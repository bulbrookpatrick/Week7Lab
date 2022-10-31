/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dataaccess.UserDB;

import models.User;

/**
 *
 * @author Patrick
 */
public class UserService {
    
    
    
    
    
    
    
    public void insert(String email, String fName, String lName, String password, int role) {
        User user = new User(email, fName, lName, password, role);
        UserDB userDB = new UserDB();
        userDB.insert(user);
    }
    
    public void update(String email, String fName, String lName, String password, int role) {
        User user = new User(email, fName, lName, password, role);
        UserDB userDB = new UserDB();
        userDB.update(user);  
    }
    
    public void delete(String email) throws Exception {
        User user = new User();
        user.setEmail(email);
        UserDB userDB = new UserDB();
        userDB.delete(user);
    }
}

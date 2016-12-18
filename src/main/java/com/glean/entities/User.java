package com.glean.entities;

import org.springframework.data.annotation.Id;

/**
 * Created by michaelplott on 12/17/16.
 */
public class User {

    @Id
    public String id;

    public String userName;

    public String password;

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
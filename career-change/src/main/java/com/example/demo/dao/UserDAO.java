package com.example.demo.dao;

import com.example.demo.domain.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserDAO {
    private List<User> users = new LinkedList<>();
    User[] a = {new User()};


    public void save(User user) {
        this.users.add(user);
    }

    public List<User> findAll() {
        return this.users;
    }

    public User find(long id) {
        User user;

        for(int i = 0; i < this.users.size(); i++) {
            if(this.users.get(i).getId() == id) {
                return this.users.get(i);
            }
        }
        return null;
    }

}

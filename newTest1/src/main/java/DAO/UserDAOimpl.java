package DAO;

import DAOinterface.UserDAO;
import User.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAOimpl implements UserDAO {

    public List<User> users;

    public UserDAOimpl() {
        users = new ArrayList<User>();
        User user1 = new User("George","malelis","HR",1);
        User user2 = new User("Peter","Walker","HR",2);
        User user3 = new User("Charles","Edan","HR",3);
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }


    @Override
    public void deleteUser(User user){
        users.remove(user.getId());
        System.out.println("User : " + user.getId() + ",deleted from database.");
    }

    @Override
    public List<User> getAllUsers(){
        return users;
    }

    @Override
    public User getUser(int id) {
        return users.get(id);
    }

    @Override
    public void updateUser(User user) {
        users.get(user.getId()).setFirstName(user.getFirstName());
    }
}

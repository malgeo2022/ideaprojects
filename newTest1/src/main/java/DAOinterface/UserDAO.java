package DAOinterface;

import User.User;

import java.util.List;

public interface UserDAO {

    public List<User> getAllUsers();
    public User getUser(int id);
    public void updateUser(User user);
    public void deleteUser(User user);



}

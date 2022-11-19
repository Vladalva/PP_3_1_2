package com.SCulacov.springbootCRUD.Service;

import com.SCulacov.springbootCRUD.Model.User;

import java.util.List;

public interface UserService {
    List<User> allUser ();
    User getUser (int id);
    void saveUser (User user);
    User updateUser (User user);
    void delete(int id);

}

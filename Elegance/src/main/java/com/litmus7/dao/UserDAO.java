package com.litmus7.dao;

import java.util.List;
import com.litmus7.model.User;
 
public interface UserDAO {
 
    public void save(User user);
     
    public List<User> list();
     
}
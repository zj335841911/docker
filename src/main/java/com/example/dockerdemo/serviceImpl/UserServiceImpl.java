package com.example.dockerdemo.serviceImpl;



import com.example.dockerdemo.dao.UserDAO;
import com.example.dockerdemo.entity.User;
import com.example.dockerdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
   private UserDAO userDAO;

    @Override
    public int insert(User user) {
        return userDAO.insert(user);
    }

    @Override
    public int delete(User user) {
        return userDAO.delete(user);
    }

    @Override
    public int update(User user) {
        return userDAO.update(user);
    }

    @Override
    public List<User> selectUser() {
        return userDAO.selectUser();
    }

    @Override
    public User findById(User user) {
        return userDAO.findById(user);
    }
}

package com.example.dockerdemo.controller;

import com.example.dockerdemo.entity.User;
import com.example.dockerdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/insert")
    @ResponseBody
    public String insert( User user) {
        String result = "添加失败！";
        int i = userService.insert(user);
        if (i != 0) {
            result = "添加成功！";
        }
        return result;
    }

    @PostMapping("/delete")
    @ResponseBody
    public String delete(User user) {
        String result = "删除失败！";
        int i = userService.delete(user);
        if (i != 0) {
            result = "删除成功！";
        }
        return result;
    }

    @PostMapping("/update")
    @ResponseBody
    public String update(User user) {
        String result = "修改失败！";
        int i = userService.update(user);
        if (i != 0) {
            result = "修改成功！";
        }
        return result;
    }

    @GetMapping("/selectUser")
    @ResponseBody
    public List<User> selectUser() {
        return userService.selectUser();
    }

    @PostMapping("/findById")
    @ResponseBody
    public User findById(User user) {
        System.out.println(666);
        //TODO:添加自己的业务代码
        return userService.findById(user);
    }


}

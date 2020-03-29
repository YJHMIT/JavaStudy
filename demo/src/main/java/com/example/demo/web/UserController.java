package com.example.demo.web;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getAll")
    public List<User> getAll(){
        return userMapper.getAll();
    }
    @GetMapping("/install")
    public List<User> install(User user){
        userMapper.install(user);
        return userMapper.getAll();
    }
    @GetMapping("/delete")
    public List<User> delete(int id){
        userMapper.delete(id);
        return userMapper.getAll();
    }
    @GetMapping("/update")
    public List<User> update(User user){
        userMapper.Update(user);
        return userMapper.getAll();
    }
    @GetMapping("/get")
    public User get(int id){
        return userMapper.getById(id);
    }
}

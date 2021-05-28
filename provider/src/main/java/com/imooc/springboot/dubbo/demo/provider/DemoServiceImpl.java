package com.imooc.springboot.dubbo.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.imooc.springboot.dubbo.demo.DemoService;
import com.imooc.springboot.dubbo.demo.provider.dao.UserDao;
import com.imooc.springboot.dubbo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private UserDao userDao;

    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }

    @Override
    public void create(User user) {
        userDao.insert(user);
    }

    @Override
    public User selectById(Long id) {
        return userDao.queryById(id);
    }

}
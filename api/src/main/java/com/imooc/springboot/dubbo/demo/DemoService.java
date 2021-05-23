package com.imooc.springboot.dubbo.demo;

import com.imooc.springboot.dubbo.entity.User;

public interface DemoService {
    String sayHello(String name);

    void create(User user);
}
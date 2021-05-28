package com.imooc.springboot.dubbo.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.imooc.springboot.dubbo.demo.DemoService;
import com.imooc.springboot.dubbo.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoFacode {

    @Reference
    private DemoService demoService;

    public String sayHello(String name) {
        return demoService.sayHello(name);
    }

    @Transactional
    public void create(User user) {
        demoService.create(user);
    }

    public User selectById(Long id) {
        return demoService.selectById(id);
    }

}

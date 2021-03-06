package com.imooc.springboot.dubbo.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.imooc.springboot.dubbo.demo.DemoService;
import com.imooc.springboot.dubbo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class DemoConsumerController {

    @Reference
    private DemoService demoService;

    @Autowired
    private DemoFacode demoFacode;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoFacode.sayHello(name);
    }

    @PostMapping("/create")
    public void create(@RequestBody User user) {
        demoService.create(user);
    }

    @GetMapping("/selectById")
    public User selectById(@RequestParam("Id") Long id) {
        //User user = demoFacode.selectById(id);
        //System.out.println(user.getId());
        Optional<User> user = Optional.ofNullable(demoFacode.selectById(id));
        return demoFacode.selectById(id);
    }

}
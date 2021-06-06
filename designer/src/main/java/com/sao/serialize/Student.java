package com.sao.serialize;

import com.sao.prototype.dog.Dog;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;

    private Dog dog;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public Student() {
        System.out.println("none-arg constructor");
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Student(String name, Integer age, Dog dog) {
        System.out.println("arg constructor");
        this.name = name;
        this.age = age;
        this.dog = dog;
    }

    // 省略 set get 方法

    @Override
    public String toString() {
        return "[" + name + ", " + age + "]";
    }
}

package com.sao.serialize;


import com.sao.prototype.dog.Dog;

import java.io.*;

public class SerializeClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("Student");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file)); // 注意这里使用的是 ObjectOutputStream 对象输出流封装其他的输出流
        Dog dog = new Dog();
        Student person = new Student("John", 101, dog);
        out.writeObject(person);
        out.close();

        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));  // 使用对象输入流读取序列化的对象
        Student newPerson = (Student) oin.readObject(); // 没有强制转换到Person类型
        oin.close();

        System.out.println(newPerson.getAge());
        System.out.println(newPerson.getName());

        System.out.println(newPerson == person);

        System.out.println(newPerson.getDog() == person.getDog());

    }
}

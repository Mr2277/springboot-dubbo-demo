package com.sao.prototype.dog;

public class DogClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Dog dog = new Dog();
        Dog cloneDog = dog.clone();
        System.out.println(dog);
        System.out.println(cloneDog);
    }
}

package com.sao.prototype.sheep;

import com.sao.prototype.dog.Dog;

public class SheepClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Dog dog = new Dog();
        SheepPrototype sheepPrototype = new SheepPrototype(dog);
        SheepPrototype cloneSheep = sheepPrototype.clone();
        System.out.println(sheepPrototype);
        System.out.println(cloneSheep);
        System.out.println(sheepPrototype.dog);
        System.out.println(cloneSheep.dog);
    }
}

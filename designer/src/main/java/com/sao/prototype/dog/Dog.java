package com.sao.prototype.dog;

public class Dog implements Cloneable {

    public Dog clone() throws CloneNotSupportedException {
        return (Dog) super.clone();
    }

}

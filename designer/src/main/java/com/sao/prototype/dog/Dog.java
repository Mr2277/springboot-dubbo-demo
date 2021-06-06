package com.sao.prototype.dog;

import java.io.Serializable;

public class Dog implements Cloneable, Serializable {

    public Dog clone() throws CloneNotSupportedException {
        return (Dog) super.clone();
    }

}

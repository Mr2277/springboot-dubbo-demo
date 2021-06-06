package com.sao.prototype.sheep;

import com.sao.prototype.dog.Dog;

public class SheepPrototype implements Cloneable {

    public Dog dog;

    public SheepPrototype(Dog dog) {
        this.dog = dog;
    }

    @Override
    public SheepPrototype clone() throws CloneNotSupportedException {
        SheepPrototype cloneSheep = (SheepPrototype) super.clone();
        cloneSheep.dog = cloneSheep.dog.clone();
        return cloneSheep;
    }

}

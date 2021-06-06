package com.sao.template.cook;

public abstract class CookTemplate {

    public void finashCook() {
        this.washVegetable();
        this.cook();
        this.eat();
    }

    public abstract void washVegetable();

    public abstract void cook();

    public abstract void eat();

}

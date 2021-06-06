package com.sao.template.cook;

public class CookMeet extends CookTemplate {

    @Override
    public void washVegetable() {
        System.out.println("清洗肉");
    }

    @Override
    public void cook() {
        System.out.println("烹饪肉");
    }

    @Override
    public void eat() {
        System.out.println("吃肉");
    }
}

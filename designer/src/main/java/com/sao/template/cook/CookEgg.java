package com.sao.template.cook;

public class CookEgg extends CookTemplate {

    @Override
    public void washVegetable() {
        System.out.println("清洗蛋");
    }

    @Override
    public void cook() {
        System.out.println("烹饪蛋");
    }

    @Override
    public void eat() {
        System.out.println("吃蛋");
    }

}

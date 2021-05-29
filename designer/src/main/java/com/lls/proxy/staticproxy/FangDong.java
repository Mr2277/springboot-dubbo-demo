package com.lls.proxy.staticproxy;

public class FangDong implements HouseTransaction {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sell() {
        System.out.println("房东卖房" + this.name );
    }

    public FangDong(String name) {
        this.name = name;
    }
}

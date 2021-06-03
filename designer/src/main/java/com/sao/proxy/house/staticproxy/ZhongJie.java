package com.sao.proxy.house.staticproxy;

public class ZhongJie implements HouseTransaction {

    private FangDong fangDong;

    public ZhongJie(FangDong fangDong) {
        this.fangDong = fangDong;
    }

    @Override
    public void sell() {
        System.out.println("中介卖房:" + fangDong.getName());
    }

}

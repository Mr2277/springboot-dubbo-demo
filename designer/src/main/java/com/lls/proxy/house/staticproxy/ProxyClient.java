package com.lls.proxy.house.staticproxy;

public class ProxyClient {
    public static void main(String[] args) {
        FangDong fangDong = new FangDong("张桂兰");
        ZhongJie zhongJie = new ZhongJie(fangDong);
        zhongJie.sell();
        fangDong.sell();
    }
}

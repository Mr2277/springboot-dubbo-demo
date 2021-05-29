package com.lls.proxy.house.dynamicproxy;

import com.lls.proxy.house.staticproxy.FangDong;
import com.lls.proxy.house.staticproxy.HouseTransaction;

public class DynaClient {
    public static void main(String[] args) {
        HouseTransaction houseTransaction = new FangDong("sun");
        DynaProxy dynaProxy = new DynaProxy();
        dynaProxy.setObjFactory(houseTransaction);
        HouseTransaction pro = (HouseTransaction) dynaProxy.getProxyInstance();
        pro.sell();
    }
}

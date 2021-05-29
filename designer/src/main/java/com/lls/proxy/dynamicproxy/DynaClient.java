package com.lls.proxy.dynamicproxy;

import com.lls.proxy.staticproxy.FangDong;
import com.lls.proxy.staticproxy.HouseTransaction;

public class DynaClient {
    public static void main(String[] args) {
        HouseTransaction houseTransaction = new FangDong("sun");
        DynaProxy dynaProxy = new DynaProxy();
        dynaProxy.setObjFactory(houseTransaction);
        HouseTransaction pro = (HouseTransaction) dynaProxy.getProxyInstance();
        pro.sell();
    }
}

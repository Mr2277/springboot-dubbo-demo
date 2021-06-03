package com.sao.proxy.ticket;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SellTicketHandler implements InvocationHandler {

    private SellTicket sellTicket;

    public SellTicketHandler(SellTicket sellTicket) {
        this.sellTicket = sellTicket;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(sellTicket, args);
        return invoke;
    }

}

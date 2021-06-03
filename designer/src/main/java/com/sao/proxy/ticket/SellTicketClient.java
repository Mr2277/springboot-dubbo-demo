package com.sao.proxy.ticket;

import java.lang.reflect.Proxy;

public class SellTicketClient {
    public static void main(String[] args) {
        SellTicket sellTicket = new SellTicketImpl();
        SellTicketHandler handler = new SellTicketHandler(sellTicket);
        SellTicket proxy = (SellTicket) Proxy.newProxyInstance(sellTicket.getClass().getClassLoader(),
                sellTicket.getClass().getInterfaces(), handler);
        proxy.sellTicket();
    }
}

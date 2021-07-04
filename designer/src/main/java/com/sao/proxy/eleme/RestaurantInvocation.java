package com.sao.proxy.eleme;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RestaurantInvocation implements InvocationHandler {

    private IRestaurant restaurant;

    public RestaurantInvocation(IRestaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Restaurant 代理");
        Object object = method.invoke(restaurant, args);
        return object;
    }
}

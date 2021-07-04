package com.sao.proxy.eleme;

import java.lang.reflect.Proxy;

public class RestaurantClient {
    public static void main(String[] args) {
        IRestaurant restaurant = new RestaurantImpl();
        RestaurantInvocation invocation = new RestaurantInvocation(restaurant);
        IRestaurant proxy = (IRestaurant) Proxy.newProxyInstance(restaurant.getClass().getClassLoader(),
                restaurant.getClass().getInterfaces(), invocation);
        proxy.cook();

        IRestaurant restaurantB = new BRestaurantImpl();
        RestaurantInvocation invocationB = new RestaurantInvocation(restaurantB);
        IRestaurant proxyB = (IRestaurant) Proxy.newProxyInstance(restaurant.getClass().getClassLoader(),
                restaurant.getClass().getInterfaces(), invocationB);
        proxyB.cook();
    }
}

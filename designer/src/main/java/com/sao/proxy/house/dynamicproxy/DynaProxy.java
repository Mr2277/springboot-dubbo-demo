package com.sao.proxy.house.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynaProxy implements InvocationHandler {

    // 代理对象需要包含真实对象，为提升真实对象的复用性，则使用Object接受
    private Object objFactory;

    public Object getObjFactory(){
        return objFactory;
    }

    public void setObjFactory(Object objFactory){
        this.objFactory = objFactory;
    }

    // 使用JDK代理类获取代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(objFactory.getClass().getClassLoader(), objFactory.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(objFactory, args);
        return invoke;
    }
}

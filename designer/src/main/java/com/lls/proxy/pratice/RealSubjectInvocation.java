package com.lls.proxy.pratice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RealSubjectInvocation implements InvocationHandler {

    private Subject subject;

    public RealSubjectInvocation(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("RealSubject内部");
        Object invoke = method.invoke(subject, args);
        return invoke;
    }
}

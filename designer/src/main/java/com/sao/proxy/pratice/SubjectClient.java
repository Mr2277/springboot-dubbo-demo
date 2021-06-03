package com.sao.proxy.pratice;

import java.lang.reflect.Proxy;

public class SubjectClient {
    public static void main(String[] args) {
        Subject subject = new RealSubjectImpl();
        RealSubjectInvocation realSubjectInvocation = new RealSubjectInvocation(subject);
        Subject proxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), realSubjectInvocation);
        proxy.oprate();
    }
}

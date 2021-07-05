package com.sao.strategy;

public class Client {
    public static void main(String[] args) {
        StrategyFactory factory = new StrategyFactory();
        BaseStrategy baseStrategy = factory.getBaseStrategy("A");
        baseStrategy.Sale();
    }
}

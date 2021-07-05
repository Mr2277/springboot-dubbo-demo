package com.sao.strategy;

public class StrategyFactory {

    private BaseStrategy baseStrategy;

    public BaseStrategy getBaseStrategy(String flag) {
        switch (flag) {
            case "A":
                baseStrategy = new SpringStrategy();
                break;
            case "B":
                baseStrategy = new WeekendStrategy();
                break;
            default:
                break;
        }
        return baseStrategy;
    }
}

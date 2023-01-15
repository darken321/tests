package Patterns.Strategy;

public class Context {
    private static Strategy strategy;

    static void setStrategy(Strategy strategy1) {
        strategy = strategy1;
    }

    static int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}

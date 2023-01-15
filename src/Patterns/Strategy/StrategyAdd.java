package Patterns.Strategy;

public class StrategyAdd implements Strategy {

    @Override
    public int execute(int a, int b) {
        System.out.println("сумма " + a + " " + b);
        return a + b;
    }
}

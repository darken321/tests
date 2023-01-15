package Patterns.Strategy;

public class StrategyMultiply implements Strategy {

    @Override
    public int execute(int a, int b) {
        System.out.println("произведение " + a + " " + b);
        return a * b;
    }
}

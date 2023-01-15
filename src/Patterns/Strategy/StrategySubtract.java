package Patterns.Strategy;

public class StrategySubtract implements Strategy {

    @Override
    public int execute(int a, int b) {
        System.out.println("разность " + a + " " + b);
        return a - b;
    }
}

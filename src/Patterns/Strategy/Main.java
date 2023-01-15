package Patterns.Strategy;

public class Main {
    public static void main(String[] args) {
        Context.setStrategy(new StrategyAdd());
        System.out.println(Context.executeStrategy(5,3));

        Context.setStrategy(new StrategySubtract());
        System.out.println(Context.executeStrategy(5,3));

        Context.setStrategy(new StrategyMultiply());
        System.out.println(Context.executeStrategy(5,3));

    }
}

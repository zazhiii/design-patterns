package Behavior.strategy;

/**
 * @author zazhi
 * @date 2025/5/10
 * @description: 策略模式
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();

        System.out.println("-----------------");

        salesMan = new SalesMan(new StrategyB());
        salesMan.salesManShow();

        System.out.println("-----------------");

        salesMan = new SalesMan(new StrategyC());
        salesMan.salesManShow();
    }
}

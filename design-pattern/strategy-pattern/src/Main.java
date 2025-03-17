import fly.FlyWithRocket;
import quack.BigQuack;

public class Main {
    public static void main(String[] args) {

        DuckA duckA = new DuckA();

        duckA.performFly();
        duckA.performQuack();

        System.out.println("duckA의 fly, quack 방법 교체");

        duckA.setFlyBehavior(new FlyWithRocket());
        duckA.setQuackBehavior(new BigQuack());

        duckA.performFly();
        duckA.performQuack();
    }
}
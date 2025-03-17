import fly.FlyWithWings;
import quack.Quack;

public class DuckA extends Duck{

    public DuckA(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("DuckA 입니다 ^^");
    }
}

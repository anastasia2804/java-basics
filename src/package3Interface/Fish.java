package package3Interface;

//Class can implement mor than 1 interface
//must override methods from the corresponding interface
public class Fish implements Prey, Predator {

    public void hunt() {
        System.out.println("This fish is hunting smaller fish");
    }

    public void flee() {
        System.out.println("This fish is fleeing from a larger fish");
    }
}

package package3Interface;

public class Rabbit implements Prey{

    //override flee method used in Prey interface
    public void flee() {
        System.out.println("The rabbit is fleeing");
    }
}

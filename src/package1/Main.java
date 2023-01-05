package package1;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

    Human human1 = new Human("Salty", 53, 84.53);
    Human human2 = new Human("Black Swan", 17, 65.3);

    //array of objects
        //create an instance of a food class
        Food food1 = new Food("empanada");
        Food food2 = new Food("shepperd's pie");
        Food food3 = new Food("milk chocolate");

        Food[] foods = {food1, food2, food3};

//        for(int i=0; i<foods.length; i++) {
//            out.println(foods[i].name);
//        }

        Car myCar = new Car("Chevy", "malibu", 1998, 2000);

        out.println(myCar.make);

        Garage garage = new Garage();

        garage.park(myCar);



    }
}
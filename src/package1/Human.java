package package1;

public class Human {

    String name;
    int age;
    double weight;

    Human (String fname, int age, double weight) {
        this.name = fname;
        this.age = age;
        this.weight = weight;
    }

    void drive () {
        System.out.println(this.name+" is driving Chevy");
    }

    public String toString() {
        return name+ "\n"+age+weight;
    }
}

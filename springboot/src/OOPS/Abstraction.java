package OOPS;
abstract class Vehicle{
   abstract void start();
   abstract void run();
}
class Car extends Vehicle{

    @Override
    void start() {
        System.out.println("Car is Started");
    }

    @Override
    void run() {
        System.out.println("Car is Running");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Car ob=new Car();
        ob.start();
        ob.run();
    }
}

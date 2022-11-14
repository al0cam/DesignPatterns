package Creational.Builder.InClass;

public class Main {
    public static void main(String args[]) {
    
        Car smallCar = new Car.Builder().setDoorCount(3).setPower(50).setType("Small").build();
        Car bigCar = new Car.Builder().setDoorCount(3).setPower(50).setType("Big").build();

        System.out.println("Type of car: "+smallCar.getType());

        System.out.println("Type of car: "+bigCar.getType());

    }
}

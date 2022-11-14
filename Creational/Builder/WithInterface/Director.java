package Creational.Builder.WithInterface;

public class Director {
    public void constructSmallCar(Builder builder)
    {
        builder.setDoors(3);
        builder.setPower(50);
        builder.setType("Small");
    }
    public void constructBigCar(Builder builder)
    {
        builder.setDoors(5);
        builder.setPower(250);
        builder.setType("Big");
    }
}

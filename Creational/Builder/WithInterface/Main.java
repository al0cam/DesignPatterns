package Creational.Builder.WithInterface;

public class Main {
    public static void main(String args[]) {
        Director director = new Director();

        SmallCarBuilder smallCarBuilder = new SmallCarBuilder();
        BigCarBuilder bigCarBuilder = new BigCarBuilder();

        director.constructSmallCar(smallCarBuilder);
        SmallCar smallCar = smallCarBuilder.getResult();

        System.out.println("Type of car: "+smallCar.getType());

        director.constructBigCar(bigCarBuilder);
        BigCar bigCar = bigCarBuilder.getResult();

        System.out.println("Type of car: "+bigCar.getType());

    }
}

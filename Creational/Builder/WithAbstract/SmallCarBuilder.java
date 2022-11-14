package Creational.Builder.WithAbstract;

public class SmallCarBuilder extends Builder{
    public SmallCar getResult() {
        return new SmallCar(doorCount,power,type);
    }
}

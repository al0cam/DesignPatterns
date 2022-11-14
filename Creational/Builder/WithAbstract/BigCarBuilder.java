package Creational.Builder.WithAbstract;

public class BigCarBuilder extends Builder{
    public BigCar getResult() {
        return new BigCar(doorCount,power,type);
    }
}

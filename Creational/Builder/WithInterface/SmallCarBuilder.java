package Creational.Builder.WithInterface;

public class SmallCarBuilder implements Builder{
    private Integer doorCount;
    private Integer power;
    private String type;


    @Override
    public void reset() {
     this.doorCount = null;           
     this.power = null;           
     this.type = null;           
    }

    @Override
    public void setDoors(int doorCount) {
        this.doorCount = doorCount;        
    }

    @Override
    public void setPower(int power) {
        this.power = power;        
    }

    @Override
    public void setType(String type) {
        this.type = type;        
    }

    public SmallCar getResult() {
        return new SmallCar(doorCount,power,type);
    }
}

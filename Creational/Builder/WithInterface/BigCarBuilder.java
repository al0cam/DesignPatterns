package Creational.Builder.WithInterface;

public class BigCarBuilder implements Builder{
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

    public BigCar getResult() {
        return new BigCar(doorCount,power,type);
    }
    
}

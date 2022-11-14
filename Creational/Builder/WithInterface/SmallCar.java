package Creational.Builder.WithInterface;

public class SmallCar {
    private Integer doorCount;
    private Integer power;
    private String type;
    
    public SmallCar(int doorCount, int power, String type) {
        this.doorCount = doorCount;
        this.power = power;
        this.type = type;
    }
    
    public int getDoorCount() {
        return doorCount;
    }
    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    
}

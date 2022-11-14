package Creational.Builder.WithInterface;

public class BigCar {
    private Integer doorCount;
    private Integer power;
    private String type;

    public BigCar(Integer doorCount, Integer power, String type) {
        this.doorCount = doorCount;
        this.power = power;
        this.type = type;
    }

    public Integer getDoorCount() {
        return doorCount;
    }
    public void setDoorCount(Integer doorCount) {
        this.doorCount = doorCount;
    }
    public Integer getPower() {
        return power;
    }
    public void setPower(Integer power) {
        this.power = power;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    
    
}

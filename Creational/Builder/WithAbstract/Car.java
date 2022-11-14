package Creational.Builder.WithAbstract;

public abstract class Car {
    protected Integer doorCount;
    protected Integer power;
    protected String type;

    public Car(Integer doorCount, Integer power, String type) {
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

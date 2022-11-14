package Creational.Builder.WithAbstract;

public abstract class Builder {
    protected Integer doorCount;
    protected Integer power;
    protected String type;

    public void reset() {
        this.doorCount = null;           
        this.power = null;           
        this.type = null;           
    }
   
    public void setDoors(int doorCount) {
        this.doorCount = doorCount;        
    }

    public void setPower(int power) {
        this.power = power;        
    }

    public void setType(String type) {
        this.type = type;        
    }
}

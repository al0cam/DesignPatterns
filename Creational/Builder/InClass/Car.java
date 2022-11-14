package Creational.Builder.InClass;

public class Car {
    private Integer doorCount;
    private Integer power;
    private String type;

    public Car() {}

    public Car(Integer doorCount, Integer power, String type) {
        this.doorCount = doorCount;
        this.power = power;
        this.type = type;
    }
    private Car(Builder builder) {
        this.doorCount = builder.doorCount;
        this.power = builder.power;
        this.type = builder.type;
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


    static class Builder{
        private Integer doorCount;
        private Integer power;
        private String type;

        public Builder() {
        }
        
        public Builder setDoorCount(Integer doorCount)
        {
            this.doorCount = doorCount;
            return this;
        }

        public Builder setPower(Integer power)
        {
            this.power = power;
            return this;
        }

        public Builder setType(String type)
        {
            this.type = type;
            return this;
        }

        public Car build()
        {
            return new Car(this);
        }

    }

}

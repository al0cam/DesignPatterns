package Creational.Builder.WithInterface;

public interface Builder {
    public void reset();
    public void setDoors(int doorCount);
    public void setPower(int power);
    public void setType(String type);
}

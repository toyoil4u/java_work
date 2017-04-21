package java14;

public class Car {
    private int speed;
    private int mileage;
    private String color;

    public int speedUp(int x){
        return speed + x;
    }

    public int speedDown(int x){
        return speed - x;
    }

    public Car() {
    }

    public Car(int speed, int mileage, String color) {
        this.speed = speed;
        this.mileage = mileage;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "car{" +
                "speed=" + speed +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                '}';
    }
}

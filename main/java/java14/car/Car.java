package java14.car;

public class Car {

    private String color;
    private int speed;
    private int gear;

    public Car() {
    }

    public Car(String color, int speed, int gear) {
        this.color = color;
        this.speed = speed;
        this.gear = gear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (speed != car.speed) return false;
        if (gear != car.gear) return false;
        return color.equals(car.color);

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", gear=" + gear +
                '}';
    }
}

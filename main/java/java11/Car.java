package java11;


public class Car {

    private String color = "red";
    private int speed = 0;
    private int gear = 1;

    public void speedUp(int x){
        speed += x ;
        setSpeed(speed);
    }

    public void speedDown(int x){
        speed -= x ;
        setSpeed(speed);
    }

    public void speedPrint(){
        System.out.println("Speed : "+speed);
    }

    public Car(String color, int speed, int gear) {
        this.color = color;
        this.speed = speed;
        this.gear = gear;
    }

    public Car() {
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
        if (speed <= 0) speed = 0;
        if (speed >= 250) speed = 250;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        if (gear<0) gear = 0;
        if (gear>5) gear = 5;
        this.gear = gear;
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

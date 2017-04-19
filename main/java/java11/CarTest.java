package java11;


public class CarTest {

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.speedUp(260);
        myCar.speedPrint();

        Car yourCar = new Car();
        yourCar.setColor("blue");
        yourCar.setSpeed(260);
        yourCar.setGear(6);
        System.out.println(yourCar.toString());


    }
}

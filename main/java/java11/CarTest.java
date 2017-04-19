package java11;


public class CarTest {

    public static void main(String[] args) {

        Car yourCar = new Car();
        yourCar.setColor("blue");
        yourCar.setSpeed(260);
        yourCar.setGear(6);
        System.out.println(yourCar.toString());

        Car c1 = new Car("blue", 100, 1);
        Car c2 = new Car("red", 0, 1);
        int n = Car.getNumberofCars();
        System.out.println("자동차수 : "+n);



    }
}

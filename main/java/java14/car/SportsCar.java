package java14.car;

public class SportsCar extends Car {

    private boolean turbo;

    public SportsCar() {
    }

    public SportsCar(String color, int speed, int gear, boolean turbo) {
        super(color, speed, gear);
        this.turbo = turbo;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SportsCar sportsCar = (SportsCar) o;

        return turbo == sportsCar.turbo;

    }

    @Override
    public int hashCode() {
        return (turbo ? 1 : 0);
    }

    @Override
    public String toString() {
        return "SportsCar{" +
                "turbo=" + turbo +
                '}';
    }
}

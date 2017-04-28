package 이지훈;

public class Manager extends Employee {
    private int bonus;

    public Manager() {
        super();
    }

    public Manager(String name, String address, int salary, String rrn, int bonus) {
        super(name, address, salary, rrn);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager >> " + super.toString() +
                " 보너스 : " + bonus;
    }
}

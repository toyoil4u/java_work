package test_ex.emp2;

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

    public void test(){
        String str = getName() +" "+ getAddress() +" "+ getSalary() +" "+ getRrn() +" "+ bonus;
        System.out.println(str);
    }
}

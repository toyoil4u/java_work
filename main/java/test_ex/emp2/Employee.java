package test_ex.emp2;

public class Employee {
    private String name;
    private String address;
    protected int salary;
    private String rrn;

    public Employee() {
    }

    public Employee(String name, String address, int salary, String rrn) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrn = rrn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "이름 : " + name +
                ", 주소 : " + address +
                ", 급여 : " + salary +
                ", 주민번호 : " + rrn +
                '}';
    }
}

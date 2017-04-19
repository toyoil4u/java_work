package java12.exercise;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee("아이유", 1000);
        Employee emp3 = new Employee("수지", 1100);
        System.out.println(Employee.getCount());
    }
}

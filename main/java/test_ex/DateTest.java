package test_ex;

public class DateTest {
    public static void main(String[] args) {

        Date date = new Date();

        date.setYear(2010);
        date.setMonth("3");
        date.setDay(2);
        date.printDate();

        date.setDate(2010,"3",3);
        date.printDate();

        Date date2 = new Date(2010,"3",4);
        date2.printDate();
    }
}

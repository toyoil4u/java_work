package test_ex;

public class Date {
    private int year;
    private String month;
    private int day;

    public Date() {
    }

    public int getYear() {
        return year;
    }

    public Date(int year, String month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setDate(int year, String month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void printDate(){
        System.out.println(year+"년 "+month+"월 "+day+"일");
    }
}

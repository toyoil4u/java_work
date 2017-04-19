package java11.exercise;

public class Oper {

    private int num1;
    private int num2;

    public Oper() {
    }

    public Oper(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int Add(){
        return num1 + num2;
    }

    public int Minus(){
        return num1 - num2;
    }

    public int Mul(){
        return num1 * num2;
    }

    public double Div(){
        return (double)num1/num2;
    }

}

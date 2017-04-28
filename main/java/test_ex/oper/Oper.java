package test_ex.oper;

public class Oper {
    private int x;
    private int y;

    public Oper() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Oper(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public int Add(){
        return x + y;
    }

    public int Minus(){
        return x - y;
    }

    public int Mul(){
        return x * y;
    }

    public double Div(){
        return (double)x / y;
    }
}

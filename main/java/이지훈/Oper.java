package 이지훈;

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

    public int add(){
        return x + y;
    }

    public int minus(){
        return x - y;
    }

    public int mul(){
        return x * y;
    }

    public double div(){
        return (double)x / y;
    }
}
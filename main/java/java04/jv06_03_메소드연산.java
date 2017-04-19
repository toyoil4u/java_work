package java04;

/**
 * Created by Administrator on 2017-04-05.
 */

public class jv06_03_메소드연산 {

    public static void main(String[] args) {

        int a = 2, b = 4;

        int add = Add(a, b);
        int minus = Minus(a, b);
        int mul = Mul(a, b);
        float div = Div(a, b);

        System.out.println("Add : "+add);
        System.out.println("Minus : "+minus);
        System.out.println("Mul : "+mul);
        System.out.format("Div : %7f",div);
    }

    private static float Div(float x, float y) {
        float result = x/y;
        return result;
    }

    private static int Mul(int x, int y) {
        int result = x * y;
        return result;
    }

    private static int Minus(int x, int y) {
        int result = x - y;
        return result;
    }

    private static int Add(int x, int y) {
        int result = x + y;
        return result;
    }



}

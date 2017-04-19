package java11.exercise;

public class OperTest {

    public static void main(String[] args) {

        Oper op = new Oper();
        op.setNum1(2);
        op.setNum2(4);
        System.out.println("Add : "+op.Add());
        System.out.println("Minus : "+op.Minus());
        System.out.println("Mul : "+op.Mul());
        System.out.format("Div : %.6f",op.Div());
    }
}

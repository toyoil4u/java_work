package java15;

public class OuterClass {

    private String secret = "Time is money.";

    public OuterClass(){
        InnerClass obj = new InnerClass();
        obj.print();
    }

    private class InnerClass {
        public InnerClass(){
            System.out.println("내부클래스");
        }
        public void print(){
            System.out.println(secret);
        }
    }
}

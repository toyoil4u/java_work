package java04;

/**
 * Created by Administrator on 2017-04-05.
 */

public class jv04_07_swap {

    public static void main(String[] args){


        int i = 1;
        int j = 3;

        System.out.println("전 : i = "+i+" , j = "+j);

        swap(i,j);

        System.out.println("후 : i = "+i+" , j = "+j);

    }

    public static void swap(int a, int b){
        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println("안 : i = "+a+" , j = "+b);
    }
}

package java04.exercise;

/**
 * Created by Administrator on 2017-04-03.
 */

public class ex04_09 {

    public static void main(String[] args){

        int sum = 0;
        for ( int i = 1 ; i <= 10 ; i++ ){
            sum = sum + abSum(1,i);
        }
        System.out.print(sum);
    }

    private static int abSum(int a, int b) {
        int sum = 0;
        for ( int i = a ; i <= b ; i ++ ){
            sum = sum + i;
        }
        return sum;
    }


}

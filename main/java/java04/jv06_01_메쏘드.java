package java04;

/**
 * Created by Administrator on 2017-04-05.
 */

public class jv06_01_메쏘드 {

    public static void main(String[] args){

        int sum = 0, sum2 = 0, sum3 = 0;

        sum = getSum(sum);
        System.out.println(sum);

        for ( int i = 1 ; i <= 100 ; i++ ){
            sum2 = sum2 + i;
        }
        System.out.println(sum2);

        for ( int i = 100 ; i <= sum2 ; i++ ){
            sum3 = sum3 + i;
        }
        System.out.println(sum3);
    }

    private static int getSum(int sum) {
        for ( int i = 1 ; i <= 10 ; i++ ){
            sum = sum + i;
        }
        return sum;
    }
}

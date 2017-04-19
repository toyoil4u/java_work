package java07.exercise;

/**
 * Created by Administrator on 2017-04-11.
 */

public class ex07_09_거스름돈 {

    public static void main(String[] args){

        int[] x = new int[9];
        x[0] = 26802980;
        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        for( int i = 0 ; i < money.length ; i++ ){
            int moneynum = moneyNum( x[i], money[i] );
            x[i+1] = x[i] - money[i]*moneynum;
            System.out.println( money[i]+"원 : "+ moneynum );
        }
    }

    public static int moneyNum( int x, int y ){
        int result = x/y;
        return result;
    }

}

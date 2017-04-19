package java04;

/**
 * Created by Administrator on 2017-04-05.
 */

public class jv04_08_예외 {

    public static void main(String[] args){

        int x = 10, y = 0, z = 0 ;

        try {
            z = x/y;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

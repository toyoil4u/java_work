package java04;

/**
 * Created by Administrator on 2017-04-05.
 */

public class jv06_04_함수호출순서 {

    public static void main(String[] args) {

        int d;
        d = Add(3,4);
        System.out.print(d);

    }

    private static int Add(int x, int y ) {

        int result = x + y ;
        return result;
    }


}

package java08;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017-04-13.
 */

public class jv09_21_date {

    public static void main(String[] args){

        Date date = null;

        date = new Date( 114, 2, 18 );
        System.out.println("114,2,19 >>" + date);

        date = new Date( 114, 0, 18 );
        System.out.println("114,0,19 >>" + date);

        date = new Date( 114, 12, 18 );
        System.out.println("114,12,19 >>" + date);

        Date from = new Date();
        SimpleDateFormat tf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");


    }

}

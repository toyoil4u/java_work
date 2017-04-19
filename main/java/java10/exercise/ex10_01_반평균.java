package java10.exercise;

import java.util.*;

/**
 * Created by Administrator on 2017-04-14.
 */

public class ex10_01_반평균 {


    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (;true;){
            System.out.print("성적을 입력하세요(중지:-1) : ");
            int temp = kb.nextInt();
            if ( temp < 0 || 100 < temp ) break;
            list.add( temp );
        }
        int sum = 0;
        for ( int i = 0 ; i < list.size() ; i++ ) sum += list.get(i);
        System.out.println("합계는 : "+sum);
        System.out.println("평균은 : "+sum/list.size());
    }




}

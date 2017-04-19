package java04;

/**
 * Created by Administrator on 2017-04-04.
 */

public class jv04_06_무한루프 {

    public static void main(String[] args){

        int i = 0;

        for (;true;){
            System.out.println("무한루프 : " + i);
            i = i + 1;

            if (i > 10){
                break;
            }
        }
    }

}

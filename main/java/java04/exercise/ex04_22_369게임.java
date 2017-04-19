package java04.exercise;

/**
 * Created by Administrator on 2017-04-05.
 */

public class ex04_22_369게임 {

    public static void main(String[] args){

        int count = 0;
        String clap ="";

        for (int i = 1 ; i <= 100 ; i++){
            String str = "" + i;
            for (int j = 0 ; j < str.length() ; j++){
                char ch = str.charAt(j);
                int x = (int)ch - 48;
                if ( x % 3 == 0 && x != 0 ) count++;
            }
            if ( count > 0 ){
                if ( count == 1 ) clap = "한";
                if ( count == 2 ) clap = "두";
                if ( count == 3 ) clap = "세";
                System.out.println(i +" 박수 "+clap+"번");
            }
            count = 0;
        }
    }
}

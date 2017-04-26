package java10.exercise;

import java.util.Arrays;

public class 단어맞추기 {
    public static void main(String[] args) {
        String str = "BEER";
        String[] s = new String[str.length()];
        for (int i = 0 ; i < str.length() ; i++){
            s[i] = str.substring(i, i+1);
        }
        Arrays.sort(s);
        for (int a = 0 ; a < str.length() ; a++) {
            for (int b = 0; b < str.length(); b++) {
                for (int c = 0; c < str.length(); c++) {
                    for (int d = 0 ; d < str.length() ; d++){


                    }
                }
            }
        }
    }
}

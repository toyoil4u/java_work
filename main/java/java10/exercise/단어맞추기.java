package java10.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class 단어맞추기 {
    public static void main(String[] args) {
        String str = "ABCD";
        String[] s = new String[str.length()];
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0 ; i < str.length() ; i++){
            s[i] = str.substring(i, i+1);
        }
        Arrays.sort(s);
        for (int a = 0 ; a < str.length() ; a++) {
            for (int b = 0; b < str.length(); b++) {
                if (b == a) continue;
                for (int c = 0; c < str.length(); c++) {
                    if (c == a) continue;
                    if (c == b) continue;
                    for (int d = 0 ; d < str.length() ; d++){
                        if (d == a) continue;
                        if (d == b) continue;
                        if (d == c) continue;
                        System.out.println(""+a+b+c+d);
                        list.add(s[a]+s[b]+s[c]+s[d]);
                    }
                }
            }
        }
        TreeSet<String> hm = new TreeSet<>(list);
        for (String s2 : hm) {
            System.out.println(s2);
        }
    }
}

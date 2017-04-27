package java10.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class 단어맞추기_재귀함수 {
    public static void main(String[] args) {
        String str = "ABC";
        String[] s = new String[str.length()];
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0 ; i < str.length() ; i++){
            s[i] = str.substring(i, i+1);
        }
        Arrays.sort(s);
        list.add("");
        TreeSet<String> hm = new TreeSet<>(list);
        for (String s2 : hm) {
            System.out.println(s2);
        }
    }
}

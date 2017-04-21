package java00;

import org.apache.commons.lang3.ObjectUtils;

public class test {
    public static void main(String[] args) {
        if (isInteger("")){
            System.out.println("숫자입니다");
        } else {
            System.out.println("숫자가 아닙니다");
        }
    }
    public static boolean isInteger(String str){
        if (str.equals("")) {
            return false;
        } else {
            for (char c : str.toCharArray())
            {
                if (!Character.isDigit(c)) return false;
            }
        }
        return true;
    }
}

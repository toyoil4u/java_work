package java15.enumeration;

import java.util.Scanner;

public class PhoneHeaderTest {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("폰번호 : ");
        String phone = kb.next();

        String phoneHeader = phone.substring(0, 3);
        if(phoneHeader.equals(PhoneHeaderClass.P010)){
            System.out.println("general");
        } else if (phoneHeader.equals(PhoneHeaderClass.P011)){
            System.out.println("sk");
        } else if (phoneHeader.equals(PhoneHeaderEnum.P016.getValue())){
            System.out.println("kt");
        } else if (phoneHeader.equals(PhoneHeaderEnum.P019.getValue())){
            System.out.println("lg");
        } else {
            System.out.println("etc");
        }
    }
}

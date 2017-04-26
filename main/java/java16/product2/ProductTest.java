package java16.product2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTest {

    public static void main(String[] args) {

        List<SaveObj> list = new ArrayList<SaveObj>();

        Scanner keyboard  = new Scanner(System.in);
        String 고유식별자 = "";
        String 상품설명   = "";
        String 생산자     = "";
        String 가격       = "";
        String ISBN번호   = "";
        String 저자       = "";
        String 책제목     = "";
        String 언어       = "";
        String 앨범제목   = "";
        String 가수이름   = "";

        for( ; true ; ) {

            System.out.print("상품 추가(1), 모든 상품 조회(2), 끝내기(3) >>");

            int select = keyboard.nextInt();

            if( select ==1 ) {
                System.out.print("상품 종류 책(1), CD(2), 회화책(3) >>");
                select = keyboard.nextInt();

                System.out.print("상품 설명 >>");
                상품설명   = keyboard.next();
                System.out.print("생산자 >>");
                생산자     = keyboard.next();
                System.out.print("가격 >>");
                가격   = keyboard.next();

                if( select ==1 ) {
                    System.out.print("책제목 >>");
                    책제목     = keyboard.next();
                    System.out.print("저자 >>");
                    저자       = keyboard.next();
                    System.out.print("ISBN번호 >>");
                    ISBN번호   = keyboard.next();

                    Book book = new Book(고유식별자, 상품설명, 생산자, 가격, ISBN번호, 저자, 책제목);
                    SaveObj obj = new SaveObj("Book", book);
                    list.add( obj);
                }
                else if( select == 3) {
                }
                else if( select == 2) {
                }
                else {
                    System.out.println("올바른 값이 아닙니다");
                }

            }
            else if( select == 2) {

                for( int i=0; i<list.size(); i=i+1){
                    SaveObj obj = list.get(i);
                    if( obj.getType().equals("Book")){
                        Book book = (Book)obj.getValue();
                        System.out.println( book.toString() );
                    }

                }
            }
            else if( select == 3) {
                break;
            }
            else {
                System.out.println("올바른 값이 아닙니다");
            }
        }
    }
}

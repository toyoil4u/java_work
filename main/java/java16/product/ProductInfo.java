package java16.product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductInfo {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0 ; i < 10 ; i++){
            System.out.print("상품추가(1), 모든 상품조회(2), 끝내기(3) >>> ");
            int sel1 = kb.nextInt();
            if (sel1 == 1){
                System.out.print("상품종류 : 책(1), 음악CD(2), 회화책(3) >>> ");
                int sel2 = kb.nextInt();
                if (sel2 == 1){
                    Book book = new Book();
                    book.setId(i);
                    System.out.print("상품설명 > ");
                    book.setInfo(kb.next());
                    System.out.print("생산자 > ");
                    book.setProducer(kb.next());
                    System.out.print("가격 > ");
                    book.setPrice(kb.nextInt());
                    System.out.print("ISBN > ");
                    book.setISBN(kb.nextInt());
                    System.out.print("저자 > ");
                    book.setAuthor(kb.next());
                    System.out.print("책제목 > ");
                    book.setTitle(kb.next());
                    list.add(book.toString());
                } else if (sel2 == 2){
                    CD cd = new CD();
                    cd.setId(i);
                    System.out.print("상품설명 > ");
                    cd.setInfo(kb.next());
                    System.out.print("생산자 > ");
                    cd.setProducer(kb.next());
                    System.out.print("가격 > ");
                    cd.setPrice(kb.nextInt());
                    System.out.print("앨범제목 > ");
                    cd.setAlbum(kb.next());
                    System.out.print("가수 > ");
                    cd.setSinger(kb.next());
                    list.add(cd.toString());
                } else {
                    ConversationBook conversationBook = new ConversationBook();
                    conversationBook.setId(i);
                    System.out.print("상품설명 > ");
                    conversationBook.setInfo(kb.next());
                    System.out.print("생산자 > ");
                    conversationBook.setProducer(kb.next());
                    System.out.print("가격 > ");
                    conversationBook.setPrice(kb.nextInt());
                    System.out.print("언어 > ");
                    conversationBook.setLanguage(kb.next());
                    list.add(conversationBook.toString());
                }
            } else if (sel1 == 2) {
                for (String str : list ) {
                    System.out.println(str);
                }
                i--;
            } else {
                break;
            }
        }
    }
}

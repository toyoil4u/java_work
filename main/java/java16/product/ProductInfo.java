package java16.product;

import java.util.Scanner;

public class ProductInfo {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("상품추가(1), 모든 상품조회(2), 끝내기(3) >>> ");
            int sel1 = kb.nextInt();
            if (sel1 == 1){
                System.out.println("상품종류 : 책(1), 음악CD(2), 회화책(3) >>> ");
                int sel2 = kb.nextInt();
                if (sel2 == 2){
                    CD cd = new CD();
                    cd.setId(i);
                    System.out.println("상품설명 > ");
                    cd.setInfo(kb.next());
                    System.out.println("생산자 > ");
                    cd.setProducer(kb.next());
                    System.out.println("가격 > ");
                    cd.setPrice(kb.nextInt());
                    System.out.println("앨범제목 > ");
                    cd.setAlbum(kb.next());
                    System.out.println("가수 > ");
                    cd.setSinger(kb.next());
                }
            } else if (sel1 == 2) {
                System.out.print("상품ID > ");



                i--;
            } else {
                break;
            }
        }
    }
}

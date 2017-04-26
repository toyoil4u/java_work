package java16.product2;

public class Book extends Product {

    private String ISBN번호;
    private String 저자;
    private String 책제목;

    public Book() {
        super();
    }

    public Book(String 고유식별자, String 상품설명, String 생산자, String 가격, String ISBN번호, String 저자, String 책제목) {

        super(고유식별자, 상품설명, 생산자, 가격);
        this.ISBN번호 = ISBN번호;
        this.저자 = 저자;
        this.책제목 = 책제목;
    }

    public String getISBN번호() {
        return ISBN번호;
    }

    public void setISBN번호(String ISBN번호) {
        this.ISBN번호 = ISBN번호;
    }

    public String get저자() {
        return 저자;
    }

    public void set저자(String 저자) {
        this.저자 = 저자;
    }

    public String get책제목() {
        return 책제목;
    }

    public void set책제목(String 책제목) {
        this.책제목 = 책제목;
    }
}

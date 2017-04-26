package java16.product2;

public class Product {
    private String 고유식별자;
    private String 상품설명;
    private String 생산자;
    private String 가격;

    public Product() {
    }

    public Product(String 고유식별자, String 상품설명, String 생산자, String 가격) {
        this.고유식별자 = 고유식별자;
        this.상품설명 = 상품설명;
        this.생산자 = 생산자;
        this.가격 = 가격;
    }

    public String get고유식별자() {
        return 고유식별자;
    }

    public void set고유식별자(String 고유식별자) {
        this.고유식별자 = 고유식별자;
    }

    public String get상품설명() {
        return 상품설명;
    }

    public void set상품설명(String 상품설명) {
        this.상품설명 = 상품설명;
    }

    public String get생산자() {
        return 생산자;
    }

    public void set생산자(String 생산자) {
        this.생산자 = 생산자;
    }

    public String get가격() {
        return 가격;
    }

    public void set가격(String 가격) {
        this.가격 = 가격;
    }
}

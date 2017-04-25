package java16.product;

public class Product {
    private int id;
    private String info;
    private String producer;
    private int price;

    public Product() {
    }

    public Product(int id, String info, String producer, int price) {
        this.id = id;
        this.info = info;
        this.producer = producer;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

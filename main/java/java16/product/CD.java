package java16.product;

public class CD extends Product {
    private String album;
    private String singer;

    public CD() {
        super();
    }

    public CD(int id, String info, String producer, int price, String album, String singer) {
        super(id, info, producer, price);
        this.album = album;
        this.singer = singer;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "상품번호>> " + getId() + "\n상품설명>> " + getInfo() + "\n생산자>> " + getProducer()
                + "\n가격정보>> " + getPrice() + "\n앨범제목>> " + album + "\n가수>> " + singer
                + "\n---------------------------";
    }
}

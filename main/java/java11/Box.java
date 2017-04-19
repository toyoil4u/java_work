package java11;

public class Box {

    private int width;
    private int length;
    private int height;

    public Box() {
    }

    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                '}';
    }

    public int getVolume(){
        return width*length*height;
    }

    public void printVolume(int vol){
        System.out.println("체적은 : "+vol);
    }
}

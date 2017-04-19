package java11;

public class BoxTest {
    public static void main(String[] args) {

        Box myBox = new Box();

        myBox.setWidth(100);
        myBox.setLength(100);
        myBox.setHeight(100);
        System.out.println(myBox.toString());
        myBox.printVolume(myBox.getVolume());
    }
}

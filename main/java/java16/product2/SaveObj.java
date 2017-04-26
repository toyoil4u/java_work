package java16.product2;

/**
 * Created by Administrator on 2017-04-26.
 */

public class SaveObj {
    private String type;
    private Object value;

    public SaveObj() {
    }

    public SaveObj(String type, Object value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

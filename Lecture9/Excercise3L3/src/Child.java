import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Child extends Parent implements Serializable {
    String brand;

    public Child() {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Child{" +
                "brand='" + brand + '\'' +
                '}'+ "Parent{" +
                "productName='" + getProductName() + '\'' +
                ", productId=" + getProductId() +
                '}';
    }
    private  void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(getProductName());
        oos.writeInt(getProductId());

    }
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        setProductName((String)ois.readObject());
        setProductId((int) ois.readInt());



    }}

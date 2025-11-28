import java.io.Serializable;

public class Example implements Serializable {
    transient int transientInt;
    static int StaticInt;
    static int staticInt;
    String name;
    int age;

    public Example(int transientInt, String name, int age) {
        this.transientInt = transientInt;
        this.name = name;
        this.age = age;
    }
}

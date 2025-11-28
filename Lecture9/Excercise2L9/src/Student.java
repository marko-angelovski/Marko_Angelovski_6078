import java.io.Serializable;

public class Student implements Serializable {
    String name;
    String phoneNumber;
    int indexNum;
    int recordNum;

    public Student(String name, String phoneNumber, int indexNum, int recordNum) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.indexNum = indexNum;
        this.recordNum = recordNum;
    }
}

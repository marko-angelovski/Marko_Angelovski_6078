import java.io.*;

public class StudentFileStrem {
    public void printData(Student student){
        System.out.println("Student name: " + student.name);
        System.out.println("Student index: " + student.indexNum);
        System.out.println("Student Record Number: " + student.recordNum);
        System.out.println("Student Phone Number: " + student.phoneNumber);

    }
    public void writeToFile(Student student,String fileName) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            System.out.println("Student is serialized,before deserialization");
        }catch(IOException e){

            e.printStackTrace();

        }
    }
    public Student readFromFile(String fileName) {
        Student result = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            result = (Student) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return result;
    }
}

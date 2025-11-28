import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String fileName = "test1.txt";
    Example example = new Example(424,"Test",20);

    try {

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(example);
        System.out.println("Object serialized, before deserialization: ");
        print(example);
        example.name = "New Name";
        example.transientInt = 456789765;
        Example.StaticInt=40;

        System.out.println("Serialization Started: ");
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Example result = (Example) objectInputStream.readObject();

        print(result);



    }catch(IOException e){
        e.printStackTrace();
    }catch (ClassNotFoundException e){
        e.printStackTrace();

    }


}

public static void print(Example e){
    System.out.println("Name: " + e.name);
    System.out.println("Age: " + e.age);
    System.out.println("Transient Int: " + e.transientInt);
    System.out.println("Static Int: " + e.StaticInt);
}
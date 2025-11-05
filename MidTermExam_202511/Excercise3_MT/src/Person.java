public class Person {
    private String name;
    private int universityId;

    public Person(String name, int universityId) {
        this.name = name;
        this.universityId = universityId;
    }
    public void displayDetails(){
        System.out.print("Name: " + name);
        System.out.print(", University ID: " + universityId);
    }
}

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Student("Alice",1001,"Computer Science"),
                new Staff("Bob",2002,"Admission"),
                new Staff("Charlie", 2003,"IT Service"),
                new Student("Diana", 1004, "Physics")

        };


        for (Person person:people){
            person.displayDetails();
        }





    }
}
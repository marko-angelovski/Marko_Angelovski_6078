public class Student extends Person {
    private String major;

    public Student(String name, int universityId, String major) {
        super(name, universityId);
        this.major = major;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.print(", Major: " + major);
        System.out.println();
    }
}

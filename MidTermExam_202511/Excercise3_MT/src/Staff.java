public class Staff extends Person{
    private String department;

    public Staff(String name, int universityId, String department) {
        super(name, universityId);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.print(", Department: " + department);
        System.out.println();
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class Main{
    public static void main(String[] args){
        List<String> names = List.of(new String[]{"Marko", "Nikola","Bojan","Ana","Dona"});
        Random random = new Random();

        List<Student> students = names.stream().map(name->{
            String yearOfStudy = random.nextInt(3)+1 + "th";
            int id = random.nextInt(1000)+9000;

            return createStudent(name,yearOfStudy,id);


        }).collect(Collectors.toList());
        System.out.println("Generated Students:\n");
        students.forEach(student -> print(student));
    }
    static Student createStudent(String fullName, String yearOfStudy, int id){
        Student student = new Student();
        student.setId(id);
        student.setFullName(fullName);
        student.setYearOfStudy(yearOfStudy);

        return student;
    }
    static void print(Student student){
        System.out.println("Full Name: " + student.getFullName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Year of study: " + student.getYearOfStudy());
    }
}

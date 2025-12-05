import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    List<String> names = Arrays.asList("AName","BName","CName","DName","EName");
    Random random = new Random();
    List<Student> stdents = names.stream().map(stude ->
            createStudent(stude,random.nextInt(1,1001),random.nextInt(18,31)))
            .collect(Collectors.toList());
    stdents.forEach(student -> printStudent(student));
    System.out.println();
    stdents.stream().forEach(s->printStudent(s));


    List <Student> filteredStudent = stdents.stream().filter(student -> student.getName().startsWith("B")).collect(Collectors.toList());
    System.out.println();
    System.out.println("B Student: ");
    filteredStudent.forEach(student->printStudent(student));

    boolean result = stdents.stream().allMatch(s->s.getAge()<25);
    System.out.println(result);
    System.out.println("Are all students younger thank 25> " + stdents.stream().allMatch(s->s.getAge()<25));

    System.out.println("Is any student younger than 25? " + stdents.stream().anyMatch(s->s.getAge()<25));

}


public static Student createStudent(String name, int indexNum,int age){
    return new Student(name,indexNum,age);
}


public static void printStudent(Student s){
    System.out.println("Name: " + s.getName());
    System.out.println("Index: " + s.getIndexNum());
    System.out.println("Age: " + s.getAge());

}

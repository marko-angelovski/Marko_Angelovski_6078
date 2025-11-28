//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Student student = new Student("Bojan", "Ne e biten", 6093, 234);
    StudentFileStrem studentFileStrem= new StudentFileStrem();

    studentFileStrem.writeToFile(student,"student.txt");
    studentFileStrem.printData(student);
    System.out.println("Serialized");


    Student readStudent = studentFileStrem.readFromFile("student.txt");
    System.out.println("Deserialized");
    studentFileStrem.printData(readStudent);

}

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int score = random.nextInt(101);
        String grade;
        String messege;
        if(score >=90){
            grade = "A";

        }else if(score >=80){
            grade = "B";
        }else if(score >=70){
            grade = "C";
        }else if(score >=60){
            grade = "D";
        }else{
            grade = "F";
        }

        switch (grade){
            case "A":
                messege = "Excelent";
                break;
            case "B":
                messege = "Good Work";
                break;
            case "C":
                messege = "Good effort";
                break;
            case "D":
                messege = "Need Work!";
                break;
            case "F":
                messege = "Better luck next time!";
                break;
            default:
                messege = "Not present";
                break;




        }
        System.out.println("You've earned a " + grade + "!" + messege);


    }
}
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//    System.out.println("Hello World");
//    System.out.println("TEST TEST TEST");
//
//    int a = 2;
//    int b = 5;
//    int c = 11;
//
//    int aTimesB = a*b;
//    if (aTimesB<c){
//        System.out.println("Smaller");
//    }else if(aTimesB>c){
//        System.out.println("Bigger");
//
//    }else{
//        System.out.println("Equal");
//
//    }

        List<String> myList = new ArrayList<>();
        myList.add("First");
        myList.add("Second");
        myList.add("third");
        List<String> secondList = new ArrayList<>();


        for (String element:myList){
            secondList.add(element.substring(6));
        }


    }
}
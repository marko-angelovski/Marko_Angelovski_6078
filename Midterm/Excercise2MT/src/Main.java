//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double[] scores = new double[3];
    Scanner scanner = new Scanner(System.in);
    double avg = 0;
    for (int i=0; i<3; i++){
        System.out.println("Enter score: ");
        scores[i] = scanner.nextDouble();

    }
    for(double s: scores){
        avg+=s;

    }
    avg/=3;
    System.out.println("The average is: " + avg);
    if(avg>=85){
        System.out.println("Excellent");
    } else if (avg<85 && avg>=70) {
        System.out.println("Good");


    } else if (avg<70&&avg>=50) {
        System.out.println("Average");

    }else {
        System.out.println("Poor");
    }

}

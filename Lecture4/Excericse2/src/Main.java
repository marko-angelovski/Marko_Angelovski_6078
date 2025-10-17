// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Car car1 = new Car("Minivan",8,"Petrol", "Black");
//        Car car2 = new Car();
//        car2.setNoSeats(6);
//        car2.setColor("Pink");
//        car1.printCar();
//        car2.printCar();
        Car[] cars = new Car[5];
        cars[0] = new Car();
        cars[1] = new Car("SUV", 6,"Diesel", "White");
        cars[2] = new Car();
        cars[3] = new Car("Tesla", 4, "Electric", "White");
        cars[4] = new Car();

        for (Car car: cars){
            System.out.println("Car: ");
            car.printCar();
        }
        int maxSeats = 0;
        for(int i = 0; i < cars.length; i ++){
            if (cars[maxSeats].getNoSeats()<cars[i].getNoSeats()){
                maxSeats = i;
            }

        }
        System.out.println("The car with the most seats is car " + maxSeats);
        System.out.println("Car Details: ");
        cars[maxSeats].printCar();


    }
}
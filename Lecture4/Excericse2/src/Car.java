public class Car {
    private String type;
    private int noSeats;
    private  String fuelType;
    private String color;

    public Car() {
        this.type = "Sedan";
        this.noSeats = 5;
        this.fuelType = "Diesel";
        this.color = "Black";

    }

    public Car(String type, int noSeats, String fuelType, String color) {
        this.type = type;
        this.noSeats = noSeats;
        this.fuelType = fuelType;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public int getNoSeats() {
        return noSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNoSeats(int noSeats) {
        this.noSeats = noSeats;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void printCar(){
        System.out.println("Type: " + type);
        System.out.println("Number of seats: "+ noSeats );
        System.out.println("Fuel Type: " + fuelType );
        System.out.println("Color: "+ color);
    }
}

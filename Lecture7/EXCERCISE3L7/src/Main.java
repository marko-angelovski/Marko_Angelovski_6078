//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    AmphibousCar car = new AmphibousCar(2,"Rocks", 3.5);
    car.drive();
    System.out.println("Fuel Capacity of car "+ car.getFuelCapacity());
    System.out.println("People Capacity: " + car.getPassangerCapacity());

}

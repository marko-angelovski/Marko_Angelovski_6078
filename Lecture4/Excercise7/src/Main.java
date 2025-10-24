import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Random random = new Random();

        Spaceship[] fleet = {
                new Spaceship("StarFire", 50, 100, 200),
                new Spaceship("Nebula", 30, 80, 150),
                new Spaceship("Galactica", 70, 120, 250),
                new Spaceship("Vanguard", 40, 90, 180),
                new Spaceship("Aurora", 60, 110, 220)
        };
        System.out.println("\n=== Battle Simulation Start ===");

        for(Spaceship ship: fleet){
            int event = random.nextInt(2);
            if(event == 0){
                ship.repairShields(random.nextInt(10,50));


            }else{
                ship.increaseFirepower(random.nextInt(20,60));
            }


        }

        // Find ship with highest firepower
        Spaceship strongestShip = fleet[0];
        for (Spaceship ship : fleet) {
            if (ship.getFirePower() > strongestShip.getFirePower()) {
                strongestShip = ship;
            }
        }
        System.out.println("\nStrongest ship after battle: " + strongestShip.getName() +
                " with firepower " + strongestShip.getFirePower());

        // Display final fleet status
        System.out.println("\n=== Final Fleet Status ===");
        for (Spaceship ship : fleet) {
            System.out.println(ship.getName() + ": Crew=" + ship.getCrewSize() +
                    ", Firepower=" + ship.getFirePower() +
                    ", Shields=" + ship.getShieldStrength());
        }
    }


}
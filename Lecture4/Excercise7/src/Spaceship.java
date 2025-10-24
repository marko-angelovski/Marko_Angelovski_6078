public class Spaceship {
    private String name;
    private int crewSize;
    private int firePower;
    private int shieldStrength;

    public Spaceship(String name, int crewSize, int firePower, int shieldStrength) {
        this.name = name;
        this.crewSize = crewSize;
        this.firePower = firePower;
        this.shieldStrength = shieldStrength;
    }
    public void increaseFirepower(int amount){
        this.firePower+=amount;
        System.out.println("Firepower increased by " + amount + " ! Current firepower is "+firePower);
    }
    public void repairShields(int amount) {
        this.shieldStrength += amount;
        System.out.println(name + " shields repaired by " + amount + ". New shield strength: " + shieldStrength);
    }

    public String getName() {
        return name;
    }

    public int getCrewSize() {
        return crewSize;
    }

    public int getFirePower() {
        return firePower;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }
}


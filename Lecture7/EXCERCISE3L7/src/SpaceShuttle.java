public class SpaceShuttle implements Vehicle,AirTransport,SpaceTransport{
    private double fuelCapacity;
    private int passangerCapacity;
    private double orbitRange;
    private double maxAltittude;

    public SpaceShuttle(double fuelCapacity, double orbitRange, int passangerCapacity, double maxAltittude) {
        this.fuelCapacity = fuelCapacity;
        this.orbitRange = orbitRange;
        this.passangerCapacity = passangerCapacity;
        this.maxAltittude = maxAltittude;
    }

    @Override
    public void fly() {
        System.out.println("Space shittle is flying");
    }

    @Override
    public double getMaxAltitude() {
        return maxAltittude;
    }

    @Override
    public void launch() {
        System.out.println("Launching!!!");

    }

    @Override
    public double getOrbitRange() {
        return orbitRange;
    }

    @Override
    public double getFuelCapacity() {
        return fuelCapacity;
    }

    @Override
    public int getPassangerCapacity() {
        return passangerCapacity;
    }
}

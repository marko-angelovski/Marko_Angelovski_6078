public class FlyingVehicle implements Vehicle,GroundTransport,AirTransport{
    private double fuelCapacity;
    private int passangerCapacity;
    private String terrainType;
    public double maxAltittude;

    public FlyingVehicle(int passangerCapacity, double fuelCapacity, String terrainType, double maxAltittude) {
        this.passangerCapacity = passangerCapacity;
        this.fuelCapacity = fuelCapacity;
        this.terrainType = terrainType;
        this.maxAltittude = maxAltittude;
    }

    @Override
    public void drive() {
        System.out.println("Flying Car is driving");
    }

    @Override
    public String getTerrainType() {
        return terrainType;
    }

    @Override
    public double getFuelCapacity() {
        return fuelCapacity;
    }

    @Override
    public int getPassangerCapacity() {
        return passangerCapacity;
    }

    @Override
    public void fly() {
        System.out.println("Flying Car flies");

    }

    @Override
    public double getMaxAltitude() {
        return maxAltittude;
    }
}

public class AmphibousCar implements Vehicle,GroundTransport {
    private double fuelCapacity;
    private int passangerCapacity;
    private String terrainType;

    public AmphibousCar(int passangerCapacity, String terrainType, double fuelCapacity) {
        this.passangerCapacity = passangerCapacity;
        this.terrainType = terrainType;
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void drive() {
        System.out.println("Car is driving");
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
}

public class SaraMountainDog extends Dog {
    String traits;

    public SaraMountainDog(String name, String traits) {
        super(name);
        this.traits = traits;
    }
    public void Traits(){
        System.out.println("Additional traits: "+traits);
    }
}

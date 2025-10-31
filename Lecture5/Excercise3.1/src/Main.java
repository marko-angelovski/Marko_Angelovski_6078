public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Buddy"),
                new Lion("Simba"),
                new Frog("Kermit"),
                new SaraMountainDog("Bernie", "Large,loyal"),
                new Animal("Mystery Creature")
        };
        for(Animal animal:animals){
            System.out.println("Name: " + animal.name);
            animal.onomatopoeia();
            if (animal instanceof SaraMountainDog){
                ((SaraMountainDog)animal).Traits();
            }
        }


    }
}
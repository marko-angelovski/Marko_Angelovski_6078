public class Lion extends Animal{
    public Lion(String name) {
        super(name);
    }

    @Override
    void onomatopoeia() {
        System.out.println("Roar");
    }
}

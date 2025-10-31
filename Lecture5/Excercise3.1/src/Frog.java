public class Frog extends Animal {
    public Frog(String name) {
        super(name);
    }

    @Override
    void onomatopoeia() {
        System.out.println("Ribbit");
    }
}

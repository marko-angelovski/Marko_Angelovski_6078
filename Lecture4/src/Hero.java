public class Hero {
    private int health;
    private int strength;

    public Hero(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public void printStatus(){
        System.out.println("Hero Stats: ");
        System.out.println("Health: " + this.health);
        System.out.println("Strength: " + this.strength);

    }
    public void takeDamage(int damage){
        if(damage<health){
            health-=damage;
        }else{
            health = 0;
        }

    }
    public  void powerUp(int value){
        strength+=value;
    }
}

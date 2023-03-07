public class Card {
    private int health;
    private int damage;

    public void attack() {
        System.out.println("Card attacks for " + damage + " damage.");
    }

    public void move() {
        System.out.println("Card moves ahead.");
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

public class Building extends Card {
    private int lifetime;

    public void place() {
        System.out.println("You placed a building.");
    }
    public void retarget() {
        System.out.println("Building retargets.");
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

}

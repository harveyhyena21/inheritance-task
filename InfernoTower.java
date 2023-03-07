public class InfernoTower extends Building {
    private int stars;

    public void blaze() {
        System.out.println("Inferno tower blazes.");
    }

    public void increaseDamage() {
        System.out.println("Inferno tower increases damage.");
    }

    @Override
    public void retarget() {
        System.out.println("The inferno tower retargets. Bzzzzz..");
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
    
}

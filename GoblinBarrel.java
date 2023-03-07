public class GoblinBarrel extends Spell {
    private int level;

    public void targetTower() {
        System.out.println("Goblin barrel targets the enemy's tower.");
    }

    public void stabTogether() {
        System.out.println("Goblins in the goblin barrel stab at the enemy together.");
    }

    @Override
    public void explode() {
        System.out.println("The goblin barrel explodes! BAM!!");
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

public class Spell extends Card {
    private String target;

    public void slow() {
        System.out.println("Spell slows enemies.");
    }

    public void explode() {
        System.out.println("Spell explodes enemies.");
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}

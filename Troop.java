public class Troop extends Card {
    private int units;

    public void chase() {
        System.out.println("Troop chases enemies.");
    }
    public void shoot() {
        System.out.println("Troop shoots at enemies.");
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }
    
}

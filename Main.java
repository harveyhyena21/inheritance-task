/*
 * Task: Create a program that showcases Inheritance and does the following
- UML Diagram
- 3 Sub Classes
- 2 Sub-Sub Classes
- 2 Unique Methods per class
- 1 unique attribute per class 
- Accessors and Mutators for each attribute
- 2 Methods shared
 */


public class Main {
    public static void main(String args[]) {
        Building building = new Building();
        Card card = new Card();
        GoblinBarrel goblinBarrel = new GoblinBarrel();
        InfernoTower infernoTower = new InfernoTower();
        Spell spell = new Spell();
        Troop troop = new Troop();

        building.place();
        card.move();
        goblinBarrel.targetTower();
        infernoTower.blaze();
        spell.slow();
        troop.chase();
    }
}
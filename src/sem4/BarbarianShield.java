package sem4;

public class BarbarianShield extends Barbarian{
    String material;
    int protection;
    public BarbarianShield(String name, int healthpoint, Axe weapon, String material, int protection) {
        super(name, healthpoint, weapon);
        this.material = material;
        this.protection = protection;
    }
}

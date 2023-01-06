package sem4;

public abstract class Warrior1 extends Warrior{

    private int protection;

    String material;

    public Warrior1(String name, int healthpoint, Weapon weapon, String material, int protection) {
        super(name, healthpoint, weapon);
        this.protection = protection;
        this.material = material;
    }
}

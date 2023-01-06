package sem4;

public class ComandorShield extends Comandor{

    String material;
    int protection;

    public ComandorShield(String name, int healthpoint, Weapon weapon, String material, int protection) {
        super(name, healthpoint, weapon);
        this.material = material;
        this.protection = protection;

    }
    @Override
    public String toString() {

        return super.toString() + String.format("материал щита: %s, уровень защиты: %d", material, protection);
    }
}

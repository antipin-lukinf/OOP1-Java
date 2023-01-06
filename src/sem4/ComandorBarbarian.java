package sem4;

public class ComandorBarbarian extends Barbarian{
    String material;
    int protection;

    public ComandorBarbarian(String name, int healthpoint, Axe weapon, String material, int protection) {
        super(name, healthpoint, weapon);
        this.material = material;
        this.protection = protection;
    }
    @Override
    public String toString() {

        return super.toString() + String.format("материал щита: %s, уровень защиты: %d", material, protection);
    }
}

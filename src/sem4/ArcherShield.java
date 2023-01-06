package sem4;

public class ArcherShield extends Archer{

    private String material;
    private int protection;

    public ArcherShield(String name, int healthpoint, Bow bow, String material, int protection) {
        super(name, healthpoint, bow);
        this.material = material;
        this.protection = protection;
    }

    @Override
    public String toString() {

        return super.toString() + String.format("материал щита: %s, уровень защиты: %d", material, protection);
    }
}

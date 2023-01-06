package sem4;

public class Barbarian extends Warrior<Axe>{
    public Barbarian(String name, int healthpoint, Axe weapon) {
        super(name, healthpoint, weapon);
    }

    @Override
    public String toString() {
        return "Варвар: " + super.toString();
    }
}

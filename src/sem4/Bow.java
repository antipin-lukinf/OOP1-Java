package sem4;

public abstract class Bow implements Weapon {
    public abstract int range();

    @Override
    public String toString() {
        return String.format(" Радиус поражения : %d  Величина урона : %d", range(), damage());
    }
}

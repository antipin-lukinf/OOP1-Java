package sem4;

public abstract class Shield implements Protect {
    public abstract String material();

    @Override
    public String toString() {
        return String.format(" Материал щита : %s  Класс защиты : %d",
                material(),
                protection());
    }
}

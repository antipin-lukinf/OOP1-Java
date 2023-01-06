package sem4;

public class SmollShield extends Shield{
    @Override
    public int protection() {
        return 5;
    }

    @Override
    public String material() {
        return "metal";
    }

    @Override
    public String toString() {
        return "Щит лучника " + super.toString();
    }
}

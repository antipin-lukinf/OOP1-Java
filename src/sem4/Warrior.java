package sem4;
//Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint
//Создать интерфейс Weapon с методом damage(), который будет показывать наносимый урон
//На основе класса Warrior создать различные типы воинов, например, лучник, меченосец, ополченец и т.п.
//У лучника добавить поле расстояние поражения.
//Создать различные виды вооружения, например, меч, лук, лопата.
//Обеспечить, чтобы определенный тип воина мог нести только определенной оружие
//Создать класс командира

public abstract class Warrior <T extends Weapon>{
    private String name;
    private int healthpoint;
    private T weapon;

    @Override
    public String toString() {
        return String.format("имя: %s, здоровье: %d, вооружен: %s,", name, healthpoint, weapon.toString());
    }

    public Warrior(String name, int healthpoint, T weapon) {
        this.name = name;
        this.healthpoint = healthpoint;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthpoint() {
        return healthpoint;
    }

    public void setHealthpoint(int healthpoint) {
        this.healthpoint = healthpoint;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}

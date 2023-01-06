package sem4;
//Создать класс щита, разработать разные типы щитов,
//добавить в семейство классов Warriors обобщения в виде щитов.
//Реструктуризировать код в конечных классах семейства Warriors.

public class Main {
    public static void main(String[] args) {
        Comandor comandor = new Comandor("Vasia", 250, new LongBow());
        Team<Archer> archers = new Team<>(comandor);
        System.out.println(comandor);
        archers.addWarrior(new Archer("Petr", 180, new LongBow()));
        archers.addWarrior(new Archer("Grek", 179, new LongBow()));
        archers.forEach(item-> System.out.println(item));
        System.out.println("Суммарный урон команды "+ archers.getAllDamage()+
                " суммарное здоровье "+archers.getAllHealthPoint()+
                " максимальная зона поражения "+archers.getMaxRadius());
        System.out.println("-----------------вторая команда--------------------");
        Comandor comandor1 = new Comandor("SuperVasia", 350, new LongBow());
        Team<Barbarian> axes = new Team<>(comandor1);
        axes.addWarrior(new Barbarian("Serg", 168, new Sekira()));
        System.out.println(comandor1);
        for (Barbarian item:axes) {
            System.out.println(item);
            
        }
        System.out.println("Суммарный урон команды "+ axes.getAllDamage()+
                " суммарное здоровье "+axes.getAllHealthPoint()+
                " максимальная зона поражения "+axes.getMaxRadius()+
                " защита");
        System.out.println("-----------------третья команда--------------------");
        Comandor comandor2 = new Comandor("Frenk", 300, new LongBow());
        Team<Warrior> gang = new Team<>(comandor2);
        System.out.println(comandor2);
        gang.addWarrior(new Barbarian("Jonn", 325, new Sekira()));
        gang.addWarrior(new Archer("Mayk", 187, new LongBow()));
        gang.forEach(item-> System.out.println(item));
        System.out.println("Суммарный урон команды "+ gang.getAllDamage()+
                " суммарное здоровье "+gang.getAllHealthPoint()+
                " максимальная зона поражения "+gang.getMaxRadius());

        System.out.println("-------------щит----------------");
        ComandorShield comandorShield = new ComandorShield("ShieldFrenk", 500, new LongBow(), "metal", 5);
        Team<Warrior> gang1 = new Team<>(comandorShield);
        System.out.println(comandorShield);
        gang1.addWarrior(new ArcherShield("SuperArcher", 300, new LongBow(), "braided", 5));
        gang1.addWarrior(new ArcherShield("SuperArcher1", 310, new LongBow(), "braided", 5));
        gang1.addWarrior(new ArcherShield("SuperArcher2", 300, new LongBow(), "braided", 5));
        gang1.forEach(item-> System.out.println(item));

        System.out.println("-------------щит1----------------");
        ComandorBarbarian comandorBarbarian = new ComandorBarbarian("ShieldBarb", 600, new Sekira(), "skin", 3);
        Team<BarbarianShield> gang2 = new Team<>(comandorShield);
        System.out.println(comandorBarbarian);
        gang2.addWarrior(new BarbarianShield("SuperBarb", 550, new Sekira(), "skin", 3));
        gang2.addWarrior(new BarbarianShield("SuperBarb1", 510, new Sekira(), "skin", 3));
        gang2.addWarrior(new BarbarianShield("SuperBarb2", 520, new Sekira(), "skin", 3));
        gang2.forEach(item-> System.out.println(item));



    }
}

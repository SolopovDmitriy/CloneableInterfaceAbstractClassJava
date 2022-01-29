package pack;

import pack.fields.Battlefield;

import pack.structure.equipment.Armor;
import pack.structure.equipment.Sword;
import pack.structure.skills.Warrior;
import pack.structure.types.Berserker;

public class Main {

    public static void test1() throws CloneNotSupportedException {
        Sword s1 = new Sword("sword", 5, 2);
        Sword s2 = s1.clone();

        s1.setAttack(1000);
        System.out.println(s1); // "sword", 1000, 2
        System.out.println(s2); // "sword", 5, 2
    }

    public static void test2() throws CloneNotSupportedException {
        Sword s1 = new Sword("sword", 5, 2);
        Sword s2 = s1;

        s1.setAttack(1000);
        System.out.println(s1); // "sword", 1000, 2
        System.out.println(s2); // "sword", 1000, 2
    }

    public static void test3() throws CloneNotSupportedException {
        int x = 10;
        int y = x;

        x = 5;
        System.out.println(x); // 5
        System.out.println(y); // 10
    }

    public static void test4() throws CloneNotSupportedException {
        Warrior w1 = new Berserker("hero",12, 5, new Armor(7, 9), new Sword("sword", 6,11));
        Warrior w2 = w1.clone();

        w1.getSword().setDurability(55);
        System.out.println(w1); // "hero",12, 5, 7, new Sword("sword", 6,55)
        System.out.println(w2); // "hero",12, 5, 7, new Sword("sword", 6,55)
    }

    public static void test5() throws CloneNotSupportedException {

    }

    public static void main(String[] args) throws CloneNotSupportedException {
//        Battlefield battlefield = new Battlefield(4);
//        battlefield.fight();

        test4();





    }
}

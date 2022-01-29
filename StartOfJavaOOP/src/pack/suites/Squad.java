package pack.suites;

import pack.structure.Types;
import pack.structure.base.Hero;
import pack.structure.equipment.Armor;
import pack.structure.equipment.Sword;
import pack.structure.types.*;

import java.util.Arrays;
import java.util.Random;

public class Squad {
    private final Random rd;
    private final Hero[] data;

    public Squad(int people) {
        rd = new Random();
        data = new Hero[people];
        fill();
    }

    private void fill() {
        for (int i = 0; i < data.length; i++) {
            data[i] = switch (rd.nextInt(Types.MAX)) {
                case Types.PALLADINE -> new Palladine("PAL", 100, 10, new Armor(5,6),new Sword("sword", 2,2));
                case Types.BERSERKER ->  new Berserker("BER", 100, 10, new Armor(7,8), new Sword("sword", 1,1));
                case Types.ELF -> new Elf("ELF", 100, 10,20,5);
                case Types.HUNTER -> new Hunter("HUN", 100, 10,20,5);
                case Types.WARLOCK -> new Warlock("WAR", 100, 10,20,0.5);
                case Types.WIZARD -> new Wizard("WIZ", 100, 10,20,0.5);

                default -> throw new RuntimeException("Types Exception");
            };
        }
    }

    public boolean isAlive() {
        for (Hero hero : data) {
            if (hero.isAlive()) return true;
        }
        return false;
    }

    public Hero hero() {
        Hero hero;
        do {
            hero = data[rd.nextInt(data.length)];
        } while (!hero.isAlive());
        return hero;
    }

    @Override
    public String toString() {
        return "Squad{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}

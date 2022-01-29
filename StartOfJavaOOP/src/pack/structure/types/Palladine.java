package pack.structure.types;

import pack.structure.equipment.Armor;
import pack.structure.equipment.Sword;
import pack.structure.skills.Warrior;

public final class Palladine extends Warrior {
    public Palladine(String hero, int HP, int attack, Armor armor, Sword sword) {
        super(hero, HP, attack, armor, sword);
        armor.setDurability((int) (armor.getDurability()* 1.15)); // 115%
//        armor.setDurability();

    }


}

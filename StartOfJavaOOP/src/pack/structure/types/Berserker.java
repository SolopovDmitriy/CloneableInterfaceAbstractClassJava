package pack.structure.types;

import pack.structure.equipment.Armor;
import pack.structure.equipment.Sword;
import pack.structure.skills.Warrior;

public final class Berserker extends Warrior {
    public Berserker(String hero, int HP, int attack, Armor armor, Sword sword) {
        super(hero, HP, attack, armor, sword);
        super.attack += super.attack * 0.2;
    }
}

package pack.structure.types;

import pack.structure.skills.Magician;

public final class Wizard extends Magician {

    public Wizard(String hero, int HP, int attack, int mana, double manaIncreaseAttackCoefficient) {
        super(hero, HP, attack, mana, manaIncreaseAttackCoefficient);
        super.mana += super.mana * 0.2;
    }



}

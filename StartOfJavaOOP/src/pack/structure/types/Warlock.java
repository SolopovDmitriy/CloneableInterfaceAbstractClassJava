package pack.structure.types;

import pack.structure.skills.Magician;

public final class Warlock extends Magician {

    public Warlock(String hero, int HP, int attack, int mana, double manaIncreaseAttackCoefficient) {
        super(hero, HP, attack, mana, manaIncreaseAttackCoefficient);
        super.manaIncreaseAttackCoefficient += super.manaIncreaseAttackCoefficient * 0.2;
    }
}

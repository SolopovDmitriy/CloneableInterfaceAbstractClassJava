package pack.structure.types;

import pack.structure.skills.Archer;

public final class Elf extends Archer {

    public Elf(String hero, int HP, int attack, int arrows, int arrowsAttackBonus) {
        super(hero, HP, attack, arrows, arrowsAttackBonus);
        super.arrowsAttackBonus += super.arrowsAttackBonus * 0.2;
    }
}

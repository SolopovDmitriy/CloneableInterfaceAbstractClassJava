package pack.structure.types;

import pack.structure.skills.Archer;

public final  class Hunter extends Archer {

    public Hunter(String hero, int HP, int attack, int arrows, int arrowsAttackBonus) {
        super(hero, HP, attack, arrows, arrowsAttackBonus);
        super.arrows += super.arrows * 0.2;
    }
}

package pack.structure.skills;

import pack.structure.base.Hero;

public abstract class Archer extends Hero {
    protected int arrows;
    protected int arrowsAttackBonus = 11;

    public Archer(String hero, int HP, int attack, int arrows,int arrowsAttackBonus) {
        super(hero, HP, attack);
        this.arrows = arrows;
        this.arrowsAttackBonus = arrowsAttackBonus;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = Math.max(arrows, 0);
    }
    @Override
    public String toString() {
        return String.format("%s, arrows=%s", super.toString(), arrows);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(Math.max(damage, 0));
    }

    @Override
    public int attack() {
        if (arrows == 0){
            return 0;
        }
        setArrows(arrows - 1);
        return rd.nextInt(attack + arrowsAttackBonus); //  у лучника более сильная атака

    }

}

package pack.structure.skills;

import pack.structure.base.Hero;

public abstract class Magician extends Hero {
    protected int mana;
    protected double manaIncreaseAttackCoefficient;

    public Magician(String hero, int HP, int attack, int mana, double manaIncreaseAttackCoefficient) {
        super(hero, HP, attack);
        this.mana = mana;
        this.manaIncreaseAttackCoefficient = manaIncreaseAttackCoefficient;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = Math.max(mana, 0);
    }

    @Override
    public String toString() {
        return String.format("%s, mana=%s", super.toString(), mana);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(Math.max(damage, 0));
    }

    @Override
    public int attack() {
        int manaAttackBonus = (int)(mana * manaIncreaseAttackCoefficient);
        setMana(mana - 1);
        return rd.nextInt(attack + manaAttackBonus);
    }






}

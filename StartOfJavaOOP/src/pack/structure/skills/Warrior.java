package pack.structure.skills;

import pack.structure.base.Hero;
import pack.structure.equipment.Armor;
import pack.structure.equipment.Sword;
public abstract class Warrior  extends Hero implements Cloneable  {
    protected Armor armor;
    private Sword sword;

    public Warrior(String hero, int HP, int attack, Armor armor, Sword sword) {
        super(hero, HP, attack);
        this.armor = armor;
        this.sword = sword;
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    //    @Override
//    public String toString() {
//        return String.format("%s, armor=%s", super.toString(), armor);
//    }


    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", HP=" + HP +
                ", attack=" + attack +
                ", alive=" + alive +
                ", armor=" + armor +
                ", sword=" + sword +
                '}';
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(Math.max(damage - armor.getDurability(), 0));
    }

    @Override
    public int attack() {
        return super.attack();
    }


    // deep clone
    @Override
    public Warrior clone() throws CloneNotSupportedException {
        Warrior w = (Warrior) super.clone(); // копируем (клонируем) воина с сылкой на меч
        w.sword = sword.clone();// копируем (клонируем) меч
        w.armor = armor.clone();// копируем (клонируем) доспехи
        return w;
    }
}
    // not deep
//    @Override
//    public Warrior clone() throws CloneNotSupportedException {
//        Warrior w = (Warrior) super.clone();
//        return w;
//    }


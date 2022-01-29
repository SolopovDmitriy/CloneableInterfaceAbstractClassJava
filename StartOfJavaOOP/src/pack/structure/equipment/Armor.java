package pack.structure.equipment;

public class Armor implements Cloneable{

    private int durability;
    private int defense;

    public Armor(int durability, int defense) {
        this.durability = durability;
        this.defense = defense;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
    @Override
    public Armor clone() throws CloneNotSupportedException {
        return (Armor) super.clone();
    }

    @Override
    public String toString() {
        return "Armor{" +
                "durability=" + durability +
                ", defense=" + defense +
                '}';
    }
}

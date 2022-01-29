package pack.structure.equipment;

public class Sword implements Cloneable{
    private String name;
    private int attack;
    private int durability;

    public Sword(String name, int attack, int durability) {
        this.name = name;
        this.attack = attack;
        this.durability = durability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", durability=" + durability +
                '}';
    }

    @Override
    public Sword clone() throws CloneNotSupportedException {
        return (Sword) super.clone();
    }


}

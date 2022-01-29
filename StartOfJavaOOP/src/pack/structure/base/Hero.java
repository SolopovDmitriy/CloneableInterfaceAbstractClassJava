package pack.structure.base;

import java.util.Random;

public abstract class Hero {
    protected final Random rd;
    protected String name;
    protected int HP;
    protected int attack;
    protected boolean alive;


    static { //static initializer

    }

    { //an initializer
        rd = new Random();
        alive = true;
    }

    public Hero(int HP, int attack) {
        this.HP = HP;
        this.attack = attack;
    }

    public Hero(String hero, int HP, int attack) {
        this(HP, attack);
        this.name = hero;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = Math.max(HP, 0);
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return String.format("name=%s, hp=%s, attack=%s, alive=%s ", name, HP, attack, alive);
    }

    public int attack() {
        return rd.nextInt(attack);
    }

    public void takeDamage(int damage) {
        setHP(HP - damage);
        if (HP <= 0) alive = false;
    }
}

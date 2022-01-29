package pack.fields;

import pack.suites.Squad;

public class Battlefield {
    private final Squad s1;
    private final Squad s2;

    public Battlefield(int size){
        s1 = new Squad(size);
        s2 = new Squad(size);
    }

    private void sleepThis(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fight(){
        while(true){
            s1.hero().takeDamage(s2.hero().attack());
            System.out.println(s1);
            System.out.println(s2);
            if(!(s1.isAlive() && s2.isAlive())) break;
            s2.hero().takeDamage(s1.hero().attack());
            System.out.println(s1);
            System.out.println(s2);
            if(!(s1.isAlive() && s2.isAlive())) break;
            System.out.println("\n\n");
            sleepThis();
        }
    }
}

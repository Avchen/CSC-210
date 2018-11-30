package csc211;

/**
 * Created by averychen on 4/14/17.
 */
class main {
    public static void main(String[] args) {

        RPGCharacter link = new RPGCharacter("Link", 1, 20);

        RPGCharacter ganon = new RPGCharacter("Ganon", 100, 100);
    }
}

public class RPGCharacter {

    private String name;
    private int lv;
    private int hp;
    private int mp;
    private int atk;
    private int def;
    private int luck;
    private int spd;

    public RPGCharacter() {
        this.name = "";
    }

    public RPGCharacter(String name, int... stats) {
        this.name = name;
        this.lv = stats[0];
        this.atk = stats[1];
    }

    public void attack (RPGCharacter opponent) {
        opponent.setHP(opponent.getHP() - this.atk);
    }

    public void lvUp(){
        lv++;
    }

    public void setHP (int newHP){
        this.hp = newHP;
    }
    
    public int getHP() {
        return hp;
    }


}

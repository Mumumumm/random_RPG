import java.util.concurrent.ThreadLocalRandom;

public class CharacterManager {
    private String player;
    private String enemy;
    private int hp;
    private int str;
    private int def;
    private int speed;
    private int critical;

//    String pEnemy, int pHp, int pStr, int pDef, int pSpeed, int pCritical

    public CharacterManager (){
    this.player = "player";
    this.hp = ThreadLocalRandom.current().nextInt(50) + 10;
    this.str = ThreadLocalRandom.current().nextInt(30) + 10;
    this.def = ThreadLocalRandom.current().nextInt(30) + 10;
    this.speed = ThreadLocalRandom.current().nextInt(20) + 1;
    this.critical = ThreadLocalRandom.current().nextInt(1,10) ;
    }

    public String getPlayer(){
        return this.player;
    }
    public String getEnemy(){
        return this.enemy;
    }

    public int getHp(){
        return this.hp;
    }
    public int getStr(){
        return this.str;
    }
    public int getDef(){
        return this.def;
    }
    public int getSpeed(){
        return this.speed;
    }
    public int getCritical(){
        return this.critical;
    }

    public void setHp(int pHp){
        this.hp = pHp;
    }
}

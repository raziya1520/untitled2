public class Hero {
    private int health;
    private int hit;
    private String superPower;

    public Hero (int health, int hit, String superPower){
        this.health = health;
        this.hit = hit;
        this.superPower = superPower;
    }

    private Hero(int health,int hit){
        this.health = health;
        this.hit = hit;
    }

    private int getHealth(){
        return health;
    }

    public int getHit(){
        return hit;
    }

    public String getSuperPower(){
        return superPower;
    }
}

import java.util.Random;
 public class Main{
     public static void main(String[] agrs){
         Boss boss = new Boss();
         boss.setHealth(300);
         boss.setHit(30);
         boss.setProtection("");
         System.out.println(boss.getHealth() + " " + boss.getHit() + " " + boss.getProtection());
     }

}





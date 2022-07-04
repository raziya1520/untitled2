import java.util.Random;
 public class Main {
     public static void main(String[] agrs) {

         Weapon weapon = new Weapon();
         weapon.setTypeWeapon("Firearms");
         weapon.setNamaWeapon("Grenade launcher");

         Boss boss = new Boss();
         boss.setHealth(600);
         boss.setDamage(60);
         boss.setProtect("");
         boss.setWeapon(weapon);

         System.out.println("Health:[" + boss.getHealth() + "]\nDamage:[" + boss.getDamage() + "]\nProtect:[" + boss.getProtect() +
                 "]\nWeapon type:[" + boss.getWeapon().getTypeWeapon() + "]" + "\nName:[" + boss.getWeapon().getNamaWeapon() + "]");


     }
 }
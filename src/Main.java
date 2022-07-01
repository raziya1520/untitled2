import java.util.Random;
public class Main{
    public static int bossHealth = 700;
    public static int bossDamage = 50;
    public static String[] heroesAttackType = {"Physical","Magical","Kinetic","Medic"};
    public static int[]heroesHalth = {250,220,230,260};
    public static int[]heroesDamage = {25,20,30,0};
    public static String bossDefenceType = "";
    public static int Medic;

        public static void main (String[] args){
        while (!isGameFinish()){
            round();
        }
    }
    public static void printStatistics(){
        System.out.println("____________________");
        System.out.println("Boss health-" + bossHealth + "Damage-" + "[" + bossDamage + "]");
        for (int i = 0; i < heroesHalth.length;i++){
            System.out.println("Heroes health"+heroesAttackType[i]+""+heroesHalth[i]+"damage-"+"["+heroesDamage[i]+"]");
        }
        System.out.println("____________________");
    }
    public static boolean isGameFinish(){
        if (bossHealth <= 0){
            System.out.println("HEROEOS WON");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i <heroesHalth.length; i++){
            if (heroesHalth[i] > 0){
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("BOSS WON");
        }
        return allHeroesDead;
        }
        public static void round(){
           chooseBosseDefence();
           bossHits();
           heroesHits();
           printStatistics();
        }
        public static void healHero() {
           if (heroesHalth[Medic] > 0){
               for (int i = 0; i < heroesAttackType.length-1; i++){
                   if (heroesHalth[i] < 100 && heroesHalth[i] > 0){
                      Random random = new Random();
                      int randomIndex = random.nextInt(100);
                       heroesHalth[i] += randomIndex;
                       System.out.println("Medic health - [" + heroesAttackType[i] + "] on [" + randomIndex + "] HS");
                       break;
                   }
               }
           }
        }
        public static void bossHits(){
            for (int i = 0; i < heroesHalth.length; i++){
                if (heroesHalth[i] > 0){
                    if (heroesHalth[i] < bossDamage){
                        heroesHalth[i] = 0;
                    } else {
                        heroesHalth[i] = heroesHalth[i] - bossDamage;
                    }
                }
            }
        }
        public static void heroesHits() {
            for (int i = 0; i < heroesHalth.length; i++) {
                if (heroesHalth[i] > 0 && bossHealth > 0) {
                    if (bossDefenceType == heroesAttackType[i]) {
                       bossHealth = bossHealth + heroesDamage[i];
                    }
                    if (bossHealth < heroesDamage[i]){
                        bossHealth = 0;
                    } else {
                        bossHealth = bossHealth - heroesDamage[i];
                    }
                }
            }
        }

        public static void chooseBosseDefence(){
           Random random = new Random();
           int randomindex = random.nextInt(heroesAttackType.length);
           bossDefenceType = heroesAttackType[randomindex];
            System.out.println("Boss choose" + bossDefenceType);
        }












   // public static void main(String[] args){
        //   double[] arrey1 = {1.3,6.4,-9.4,6.3,-9.2,26.6,-5.1,1.5,-3.4,-7.8,-1.3,6.8,-2.4,6.2,-4.5,};
       // int index = 0;
      //  double sum = 0.0;
     //   boolean on = false;
     //   for (double sumedNumbers : arrey1){
      //      if (sumedNumbers < 0 ){
         //       on = true;
       //     }else  if (on == true){
        //        sum += sumedNumbers;
        //        index++;
       //     }
       // }
       // double number = sum / index;
       // System.out.println(index);
       // System.out.println(sum);
      //  System.out.println("my answer" + number);











}












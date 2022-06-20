public class main {

    public static void main(String[] args) {
        System.out.println(maxFinder(15,27));
        System.out.println(maxFinder(12,22));
        System.out.println(maxFinder(18,30));
        System.out.println(maxFinder(25,33));
        System.out.println(maxFinder(30,20));

    }


    public static String maxFinder(int age, int temperatur) {
       if (age >= 20 && age <= 40 && temperatur >= -20 && temperatur <= 30)
           return "Can go outside 1";

       else if (age <20 && temperatur >= 0 && temperatur <= 25)
           return "Can go outside 2";
       else if (age < 45 && temperatur >= -10 && temperatur <= 25)
           return "Can go outside 3";
       else
           return "Stay at home";

    }


}


























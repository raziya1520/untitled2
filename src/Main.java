import java.util.Random;
import java.util.concurrent.LinkedTransferQueue;

public class Main{
    public static void main(String[]args){
        double[] arrey1 = {5.8,6.7,3.1,-6.9,2.6,-9.3,-6.5,9.5,-3.1,8.2,9.1,-6.1,3.5,-6.4,9.1};
        int index = 0;
        double sum = 0.0;
        boolean on = false;
       for (double summedNumbers : arrey1){
           if (summedNumbers < 0 ){
               on = true;
           } else if (on == true){
               sum += summedNumbers;
               index++;
           }
       }
       double number = sum / index;
        System.out.println(index);
        System.out.println(sum);
        System.out.println("my answer" + number);

    }






}












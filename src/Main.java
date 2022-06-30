import java.util.Random;
import java.util.concurrent.LinkedTransferQueue;

public class Main{
    public static void main(String[] args){
        double[] arrey1 = {1.3,6.4,-9.4,6.3,-9.2,26.6,-5.1,1.5,-3.4,-7.8,-1.3,6.8,-2.4,6.2,-4.5,};
        int index = 0;
        double sum = 0.0;
        boolean on = false;
        for (double sumedNumbers : arrey1){
            if (sumedNumbers < 0 ){
                on = true;
            }else  if (on == true){
                sum += sumedNumbers;
                index++;
            }
        }
        double number = sum / index;
        System.out.println(index);
        System.out.println(sum);
        System.out.println("my answer" + number);
    }










}












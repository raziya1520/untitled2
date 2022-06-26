import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {
        double[] arrey1 = {2.1,-3.2,5.4,-6.1,7.6,-4.3,-1.2,4.7,4.1,9.5,-4.3,87.4,3.6,-7.8,3.9};
       int index = 0;
       double sum = 0.0;
       boolean on = false;
       for (double summedNumbers : arrey1){
           if (summedNumbers < 0){
               on = true;
           }else if (on == true ){
               sum += summedNumbers;
               index++;
           }
        }
        double nuumber = sum / index;
        System.out.println(index);
        System.out.println(sum);
        System.out.println("my answer" + nuumber);

        }


}











































































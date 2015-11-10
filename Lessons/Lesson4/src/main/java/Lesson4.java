import java.lang.Math;
/**
 *
 * Created by user on 02.11.2015.
 */
public class Lesson4 {
    public static void main (String[] args){
       double x = 938;
        int y = 246;
        int z = 2;
        int a = (int)((x/y)*Math.pow(10,(z+1)));
        int Zn = (int)(a-(int)(a/10)*10);

        if (Zn >= 5){
            System.out.println((((int)(a/10)+1)/Math.pow(10.0, (double) z)));
        }
        else {
            System.out.println((double)((int)(a/10))/Math.pow(10.0,(double)z));

        }




    }
}

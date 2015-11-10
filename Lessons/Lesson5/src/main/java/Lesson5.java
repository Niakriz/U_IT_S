/**
 * Created by user on 09.11.2015.
 */
public class Lesson5 {
    public static void main(String[] args) {

        int a = 44;
        int b = 25;


        if (a > b) {
            System.out.println((a * b) + (a / (a + b)));
        } else if ( a < b){
            System.out.println(((a * b) / 2) - (b + (a * b++)));
        } else {
            System.out.println(((a * b) / 2) - (b + (a * b++)));
            System.out.println((a * b) + (a / (a + b)));

        }
    }
}
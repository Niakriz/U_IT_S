/**
 * Туда и обратно ;)
 */
public class Task2 {
    public static void main (String[] args){
        int a = 3;
        int b = 5;

        System.out.println (a+" "+b);

        a = a + b;
        System.out.println(a);
        b = a - b;
        System.out.println(b);
        a = a - b;
        System.out.println(a);


        System.out.println(a+ " "+b);

        a = a ^ b;
        System.out.println(a);
        b = b ^ a;
        System.out.println(b);
        a = a ^ b;
        System.out.println(a);

        System.out.println(a+ " "+b);
    }

}

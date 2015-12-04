package uits.jv.Lesson11.Lesson11p1;

/**
 * Created by user on 04.12.2015.
 */
public class App {
    //enum Seasons  {winter,spring,summer,outums};
    public static void main (String[] args){
        /** int a = 5;
        int b = 3;
        int c = 10;
        Object [] arr = new Object[10];

        //a + (++b * --c);
        b += --c*a++;

        System.out.println(a);

        System.out.println(b);

        System.out.println(c);

        System.out.println(arr[3]);
        byte e = 120;
        char p = 300;
        int r = (byte)e+p;

        System.out.println(r); **/



        /** System.out.println(Seasons.class.getName());

        Seasons seasons = Seasons.outums;

        switch (seasons){

            case winter:{
                System.out.println("");
                System.out.println("Холодно Сцуко и хлюп хлюп хлюп");
            }break;
            case summer:{
                System.out.println("");
                System.out.println("Жарко блё");
            }break;
            case spring:{
                System.out.println("");
                System.out.println("Жарко тоже еще и мокро");
            }break;
            case outums:{
                System.out.println("");
                System.out.println("просто дохуя мокро");
            }break;

        } **/

      /**  System.out.println(Seasons.valueOf("spring"));

        Seasons[] s = Seasons.values();

        for (int i = 0; i < s.length; i++){

            System.out.println(s[i]+"");


        }
        System.out.println(Seasons.summer.ordinal()); */

        System.out.println(Planets.Earth.massa);


    }


}

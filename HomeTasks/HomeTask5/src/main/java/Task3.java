/**
 * Created by nia on 11.11.2015.
 */
public class Task3 {
    public static void main (String[] args){

        int[][] mass;
        mass = new int[5][];

       /**for (int i = mass.length - 1; i >=0;i--){
            mass[i] = new int[i+1];
            for (int j = mass[i].length -1; j >=0;j--){
                System.out.print(mass[i][j] + " ");
            }System.out.println();

        }

        for (int i = 0; i < 5;i++){
            mass[i] = new int[i+1];
            for (int j = 0; j < mass[i].length;j++){
                System.out.print(mass[i][j] + " ");
            }System.out.println(); */

        for (int i = mass.length - 1; i >=0;i--){
            mass[i] = new int[i+1];
            for (int j = mass[i].length -1; j >=0;j--){
                if(j==mass[i].length-1) {
                    int x = mass.length - mass[i].length; //длинана массива - длинна строки
                    for (int t = 0; t < x; t++) {
                        System.out.print(" ");
                    }
                }
                System.out.print(mass[i][j]);
            }System.out.println();
        }

        }

    }


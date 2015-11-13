/**
 * Created by Nia on 11.11.2015.
 */

public class Task1 {



    public static void main (String[] args){

        int[] mass = {7,4,6,3,5,2,1};

        for (int i = 0; i < mass.length - 1; i++){
            for (int j = 0; j < mass.length - i - 1; j++){

                if (mass[j] > mass[j + 1]){
                  /** int temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp; */
                    int a = mass[j];
                    int b = mass[j + 1];
                    int c;
                    c = a;
                    a = b;
                    b = c;

                }


            }

        }

        for (int i = 0; i < mass.length - 1; i++){
            for(int j = 0; j < mass.length - i - 1; j++){

                if(mass[j] > mass[j + 1]){
                    int temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;

                }
            }

        }
        for (int i = 0; i < mass.length; i++){
            System.out.print(mass[i]+" " );
        } System.out.println();

    }
}

/**
 * Created by Nia on 14.11.2015.
 */
public class Task1 {

    static public void main(String[] args){

       int[][] mass = new int[10][10];


        for (int i = 0; i<mass.length;i++){
            for (int j = 0; j<mass.length;j++){

                System.out.print(i + " ");

                mass[i][j] = i;

            }System.out.println();
        }
        System.out.println();
        for (int i = 0 ; i < mass.length; i++ ){
            for (int j = 0; j< mass[i].length; j++){
                System.out.print(mass[j][i]+" ");
            }System.out.println();
        }


    }

    }

/**
 * Created by user on 19.11.2015.
 */
public class Conferese1 {
    public static void main (String[] args){

        int [] array = {10,19,18,17,16,15,13};
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        array = add(array ,10,-128);

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static int[] add(int[] src , int count, int value){
        int [] tmp = new int[src.length +count];
        for (int i = 0; i < tmp.length;i++){
            if (i < src.length){
                tmp[i] = src[i];
        }else {
                tmp[i] = value;
            }
        }

        return tmp;
    }
}

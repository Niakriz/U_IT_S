package uits.jv.Lesson13.Streams;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nia on 11.12.2015.
 */
public class App {
    public static void main (String[] args) throws IOException {

        String j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Назави меня");

        j = sc.next();

        File f = new File(j);

        if (!f.exists()) {
            try {
                f.createNewFile();
                System.out.println("Ашо мы создали: " + f);
            }catch (Exception ex){
                System.out.println("НЭМАГУ");
                ex.printStackTrace();
            }

        }else {

            System.out.println("Ужо есть");
        }
        Random r = new Random();
        byte[] arr = new byte[1024];

        for (int i = 0; i < arr.length;i++){
            arr[i] = (byte)r.nextInt(127);
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream os = new FileOutputStream(f);
        baos.write(arr, 0, arr.length);
        baos.writeTo(os);

        String dataline = null;
        BufferedReader bufferedReader = null;



        FileReader fileReader = new FileReader(f);
        bufferedReader = new BufferedReader(fileReader);
        while ((dataline = bufferedReader.readLine())!= null){


            System.out.println(dataline);


        }



    }
}

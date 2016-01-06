package uits.jv.Lesson13;

import java.io.File;

/**
 * Created by Nia on 11.12.2015.
 */
public class Files {
    static public void main (String[] args){

        File f = new File("lesoon13");

        if (f.exists()) {

        }else {
           try {
               f.createNewFile();
           }catch (Exception ex){
               System.out.println("Õ›Ã¿√”");
               ex.printStackTrace();
           }
        }


    }
}

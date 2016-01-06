package uits.jv.Lesson10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 30.11.2015.
 */
public class Lesson10 {
    static public void main (String[] args){
        List<Integer> iList = new ArrayList();

        List<Integer> iLList = new LinkedList<Integer>();

        for (int i = 0; i< 10;i++ ){
            iList.add(new Integer(i));  //»нициализаци€ листа
            iLList.add(new Integer(i)); // инициализаци€ линкед лист
        }
        for(int i = 0; i < iList.size(); i++){

            //System.out.println(iList.get(i));
           // System.out.println(iLList.get(i));
        }

        Iterator it = iList.iterator(); 
        Iterator itt = iLList.iterator();

        while (it.hasNext()){

            System.out.println(it.next());
        }
        while (itt.hasNext()){
            System.out.println(itt.next());
        }



    }
}

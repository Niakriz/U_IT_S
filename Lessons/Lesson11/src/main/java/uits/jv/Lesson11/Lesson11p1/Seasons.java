package uits.jv.Lesson11.Lesson11p1;

/**
 * Created by user on 04.12.2015.
 */
public enum Seasons {
    winter,spring,summer,outums;
}
enum Planets {

    Venus(2,2),Earth(3,7),Saturn(6,1),Mars(4,20);

    int order;
    int massa;

    Planets(int order, int massa){
        this.order = order;
        this.massa = massa;
    }

}

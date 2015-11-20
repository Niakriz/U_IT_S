/**
 * Created by user on 16.11.2015.
 */
public class Child extends Parent {

    static {
        System.out.println("Child.Static");

    }
    {
        System.out.println("Child.notStatic");
    }
    Child(){

        System.out.println("Child()");
    }

}

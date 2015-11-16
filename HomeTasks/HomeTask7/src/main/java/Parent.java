/**
 * Created by user on 16.11.2015.
 */
public class Parent {
    static {
        System.out.println("Parent.Static");
    }
    {
        System.out.println("Parents.Static2");
    }
    Parent(){
        System.out.println("Parents.Static3");

    }
}

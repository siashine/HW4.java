import java.lang.*;
 
public class task1 {
 
    public static void main(String args[])
    {
        StringBuffer sbf = new StringBuffer("1 2 3 4");
        System.out.println("String buffer  = " + sbf);
        sbf.reverse();
        System.out.println("String buffer after reversing = " + sbf);
    }
}
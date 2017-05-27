package certificacion;


//What will the following code print when compiled and run?
import java.util.*;
public class ArrayList_Exception {
    public static void main(String[] args) throws Exception {
        List  al = new ArrayList(); //1
        al.add(111); //2
        System.out.println(al.get(al.size()));  //3
     }
}
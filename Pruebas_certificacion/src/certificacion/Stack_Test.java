package certificacion;

import java.util.Stack;

public class Stack_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Stack s1 = new Stack (); //Crea un obejto tipo array
	      Stack s2 = new Stack (); //Crea un obejto tipo array
	      processStacks (s1,s2);	//En el metodo de al primero le agrega un valor y en el mismo metodo iguala lo que vale uno a lo que vale el otro, entonces los dos tienen la misma posicion en memoria por ende uno queda vacío.
	      System.out.println (s1 + "    "+ s2);
	      
	}
	
	   public static void processStacks(Stack x1, Stack x2){
		      x1.push (new Integer ("100")); //assume that the method push adds the passed object to the stack.
		      x2 = x1;
		   }
	 
}

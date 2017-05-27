package certificacion;

public class SayHello {


   public static void main(String[] args){  new SayHello().sayHello(); }   //1
   public static void sayHello(){ System.out.println("Static Hello World"); }  //2
   public void sayHello() { System.out.println("Hello World "); }  //3
   
}
//What will be the result of compiling and running the class?
	


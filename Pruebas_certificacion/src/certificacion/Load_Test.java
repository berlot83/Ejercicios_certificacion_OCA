package certificacion;

//What will be printed when the following code is compiled and run?
public class Load_Test{
    
    public static void main(String[] args) throws Exception {
    	Load_Test t = new Load_Test();
         int i = t.getLoad();
         double d = t.getLoad();
         System.out.println( i + d );
    }

    public int getLoad() {
        return 1;
    }

    public double getLoad(){ 
        return 3.0;
    }

}
	


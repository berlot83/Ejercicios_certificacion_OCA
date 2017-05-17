package certificacion;

public class Thorows_exception {
    public static void main(String[] args) throws Exception{
    	Thorows_exception tc = new Thorows_exception();
        tc.myMethod();
    }
    
    public void myMethod() throws Exception {
        yourMethod();
    }
    
    public void yourMethod() throws Exception {
        throw new Exception();
    }

}

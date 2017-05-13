package certificacion;

//What will the following code print when run?
public class Switch_control {
    public void switchString(String input){
        switch(input){
            case "a" : System.out.println( "apple" );
            case "b" : System.out.println( "bat" );
                break;
            case "B" : System.out.println( "big bat" );    
            default : System.out.println( "none" );
           
        }
    }

    public static void main(String[] args) throws Exception {
    	Switch_control tc = new Switch_control();
        tc.switchString("B");
    }

	
}

package certificacion;

//Which line will fail?
public class Valid_Characters {


		   public static void main(String args[]){
			      char c;
			      int i;
			      c = 'a';//1
			      i = c;  //2
			      i++;    //3
		  //      c = i;  //4 En esta estaba el error
			      c++;    //5
			   }

}

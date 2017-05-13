package certificacion;

public class Data_types_valid {
	
	String str;
	String str1= this.toString();
	
			//La segunda no anda en un contexto estatico
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
			}

			
			//En los metodos no estaticos funcionan las dos declaraciones arriba hechas
			public String devolverString(){
				 
				String str1= this.toString();

				
				return str1;
			}
			

			
	}

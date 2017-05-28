package certificacion;

//En esta clase te mezclé los atributos, metodos y todo lo demás, y te los estpy sacando por consola con el método main

public class Electrodomesticos {
	
	
	public static void main(String args[]){
		
		Electrodomesticos e= new Electrodomesticos();
				System.out.println(e.multiplicarAncho(2.55, 3));
				System.out.println(e.dividirAltura(15.00, 2));
				System.out.println(e.dimensiones(59.21, 75.45, 56.87));
				
				e.setAncho(25.26);
				e.setAltura(59.98);
				e.setProfundidad(59.65);
				e.setFunciones(3);
				e.setMarca("Whilpoll");
				e.setModelo("RDFXG56");
				System.out.println(e.getAncho());
				System.out.println(e.getAltura());
				System.out.println(e.getProfundidad());
				System.out.println(e.getFunciones());
				System.out.println(e.getMarca());
				System.out.println(e.getModelo());
				
				
				
	}
	
	//A partir de acá están los atributos, setters, getters y métodos también
	
	private double ancho;
	private double altura;
	private double profundidad;
	private String marca;
	private String modelo;
	private int funciones;
	
	
			public double getAncho() {
				return ancho;
			}
			public void setAncho(double ancho) {
				this.ancho = ancho;
			}
			public double getAltura() {
				return altura;
			}
			public void setAltura(double altura) {
				this.altura = altura;
			}
			public double getProfundidad() {
				return profundidad;
			}
			public void setProfundidad(double profundidad) {
				this.profundidad = profundidad;
			}
			public String getMarca() {
				return marca;
			}
			public void setMarca(String marca) {
				this.marca = marca;
			}
			public String getModelo() {
				return modelo;
			}
			public void setModelo(String modelo) {
				this.modelo = modelo;
			}
			public int getFunciones() {
				return funciones;
			}
			public void setFunciones(int funciones) {
				this.funciones = funciones;
			}
			
			//Métodos que mezclan datos, pero siempre devuelven lo que declaran.
					public double multiplicarAncho(double ancho, int cantidad){
						
						double ancho1= ancho * cantidad;
						
						return ancho1;
					}
					
					
					public double dividirAltura(double altura, int divisor){
						
						double altura1= altura / divisor;
						
						return altura1;
					}
					
					
					public String dimensiones(double ancho, double altura, double profundidad){
					
						return "La cocina que me voy a comprar tiene las siguientes medidas, ancho: "+ ancho + ", alto: " + altura + " y profundidad:  " + profundidad;
					}

			
}

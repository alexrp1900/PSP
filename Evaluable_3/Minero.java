package Evaluable_3;

public class Minero implements Runnable {
	//Atributos
	private int bolsa;
	private int tiempoExtraccion;
	Mina mn;
	//Constructor
	public Minero(Mina mn) {
		this.bolsa = 0;
		this.tiempoExtraccion = 1000;
		this.mn = mn;
	}
	//Getters and Setters
	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}

	public int getTiempoExtraccion() {
		return tiempoExtraccion;
	}

	public void setTiempoExtraccion(int tiempoExtraccion) {
		this.tiempoExtraccion = tiempoExtraccion;
	}

	public Mina getMn() {
		return mn;
	}

	public void setMn(Mina mn) {
		this.mn = mn;
	}
	//Hago un metodo para que cuando un minero obtenga el oro se le reste a la mina
	synchronized public void extraerRecurso() {
		
		while(mn.getStock()>0) {
			
			bolsa++;
			
			mn.setStock(mn.getStock()-1);
			
			System.out.println("minero ha sacado: " + bolsa);
			System.out.println("Queda "+mn.getStock()+" oro");
		}
		
		
		
	}
	//Ejecuto el metodo creado anteriormente
	@Override
	 public void run() {
		
		extraerRecurso();
		
		
	}
}

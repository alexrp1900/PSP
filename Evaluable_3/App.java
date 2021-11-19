package Evaluable_3;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) throws InterruptedException {
		
		Mina mina1 = new Mina();

	
		//Creo ArrayList Minero
	ArrayList<Minero> m = new ArrayList<Minero>();
	//Hago un for para crear 10 mineros
	for(int cont = 0; cont != 10;cont++) {
		
		Minero op = new Minero(mina1);
		m.add(op);
		
		Thread hilo = new Thread(op);
		hilo.start();
		System.out.println("-----------------");
	}
	//Hago un for para contar el oro del bolsa
	for (int i = 0; i < m.size(); i++) {
	int	 bls = m.get(i).getBolsa();
		
		 System.out.println("Total bolsa: "+bls);
	}
	
	}

}

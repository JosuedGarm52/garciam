package Source;

import Source.Main;

public class Main {
	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 },6);
		Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 },5);
		Cliente cliente3 = new Cliente("Cliente 3", new int[] { 1, 2, 5, 1, 3 },5);

		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		cajeraThread cajera1 = new cajeraThread("Cajera 1", cliente1, initialTime);
		cajeraThread cajera2 = new cajeraThread("Cajera 2", cliente2, initialTime);
		cajeraThread cajera3 = new cajeraThread("Cajera 3", cliente3, initialTime);
		
		cajera1.start();
		cajera2.start();
		cajera3.start();
		System.out.println("Programa terminado");
	}
}
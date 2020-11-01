package Source;

public class mainRunnable implements Runnable{
		private Cliente cliente;
		private cajeraThread cajera;
		private long initialTime;
		
		public mainRunnable(Cliente cliente1, cajeraThread cajera1, long initialTime2) {
			// TODO Auto-generated constructor stub
			this.cajera = cajera1;
			this.cliente = cliente1;
			this.initialTime = initialTime2;
		}
		
		public static void main(String[] args) {

			Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 },6);
			Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 },5);
			Cliente cliente3 = new Cliente("Cliente 3", new int[] { 1, 2, 5, 1, 3 },5);

			// Tiempo inicial de referencia
			long initialTime = System.currentTimeMillis();
			cajeraThread cajera1 = new cajeraThread("Puesto 1", cliente1, initialTime);
			cajeraThread cajera2 = new cajeraThread("Puesto 2", cliente2, initialTime);
			cajeraThread cajera3 = new cajeraThread("Puesto 3", cliente3, initialTime);
			

			Runnable proceso1 = new mainRunnable(cliente1, cajera1, initialTime);
			Runnable proceso2 = new mainRunnable(cliente2, cajera2, initialTime);
			Runnable proceso3 = new mainRunnable(cliente3, cajera3, initialTime);
			
			new Thread(proceso1).start();
			new Thread(proceso2).start();
			new Thread(proceso3).start();
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			this.cajera.ProcesarCompra(this.cliente, this.initialTime);
		}
}


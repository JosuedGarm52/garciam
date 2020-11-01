package Source;


public class cajeraThread extends Thread  {
	private String nombre;

	private Cliente cliente;

	private long initialTime;

	// Constructor, getter & setter

	public cajeraThread(String string, Cliente cliente2, long initialTime2) {
		// TODO Auto-generated constructor stub
		this.nombre = string;
		this.cliente = cliente2;
		this.initialTime= initialTime2;
	}

	@Override
	public void run() {
		
		System.out.println("La cajera " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " 
					+ this.cliente.getNombre() + " EN EL TIEMPO: " 
					+ (System.currentTimeMillis() - this.initialTime) / 1000 
					+ "seg");

		for (int i = 0; i < cliente.lenght; i++) { 
			this.esperarXsegundos(cliente.getCarroCompra(i));
			System.out.println("La maquina esta procesado el producto " + (i + 1) 
			+ " del cliente " + this.cliente.getNombre() + "->Tiempo: " 
			+ (System.currentTimeMillis() - this.initialTime) / 1000 
			+ "seg");
		}

		System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " 
						+ this.cliente.getNombre() + " EN EL TIEMPO: " 
						+ (System.currentTimeMillis() - this.initialTime) / 1000 
						+ "seg");
	}

	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}

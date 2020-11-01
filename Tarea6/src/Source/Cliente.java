package Source;

public class Cliente {
	private String nombre="Prueba";
	private int[] carroCompra = new int[] {1,2,3};
	public int lenght = 0;
	public Cliente(String string, int[] is, int len) {
		// TODO Auto-generated constructor stub
		this.nombre = string;
		this.carroCompra = is;
		this.lenght = len;
	}
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	public Object getCarroCompra() {
		// TODO Auto-generated method stub
		return carroCompra;
	}
	public int getCarroCompra(int x) {
		// TODO Auto-generated method stub
		return carroCompra[x];
	}
	
}

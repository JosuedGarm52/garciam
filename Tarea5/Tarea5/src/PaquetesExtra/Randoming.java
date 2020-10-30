package PaquetesExtra;
import java.util.*;

public class Randoming 
{
	public Randoming()
	{
		// Metemos en una lista los números del 1 al 40.
	    numbers = new ArrayList<Integer>(24);
	}
	List<Integer> numbers;
	// Instanciamos la clase Random
	Random random = new Random();
	public void GenerarAleatorio()
	{
		// Vamos a generar 10 números aleatorios sin repetición
		while (numbers.size()<24) 
		{
		   // Número aleatorio entre 0 y 40, excluido el 40.  
		   int randomNumber = random.nextInt(25);

		   // Si no lo hemos usado ya, lo usamos y lo metemos en el conjunto de usados.
		   if (!numbers.contains(randomNumber))
		   {
		      //System.out.println("Not Repeated Random Number "+randomNumber);
		      numbers.add(randomNumber);
		   }
		}
	}
}

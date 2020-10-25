package PaquetesExtra;
import javax.swing.JButton;
import javax.swing.JPanel;

public class localizarBoton 
{
	public localizarBoton(JPanel temp)
	{
		temporal = temp;
	}
	JPanel temporal;
	public JPanel ObtenerValor()
	{
		boolean vacia=false;
		int a=0;int contenido=0;
		do
		{
			if(temporal.getComponent(a)!=null)
			{
				JButton bot = (JButton)temporal.getComponent(a);
				if(bot!=null)
				{
					
				}
				contenido++;
				a++;
			}
			vacia=true;
		}while(vacia);
		for(int x=0;x<contenido;x++)
		{
			
		}
		return null;
	}
}

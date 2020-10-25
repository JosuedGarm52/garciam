package PaquetesExtra;

import javax.swing.JButton;

public class swap 
{
	JButton temporal;
	public JButton deslizar(JButton tocado, JButton base)
	{
		if(base==null)
			return null;
		temporal =tocado;
		tocado=base;
		base=temporal;
		return tocado;
	}
}

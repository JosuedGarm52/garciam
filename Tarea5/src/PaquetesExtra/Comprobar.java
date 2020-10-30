package PaquetesExtra;

import javax.swing.JButton;

public class Comprobar 
{
	public boolean Comenzo = false;
	public int vv=0;
	public void getComenzo(boolean IsComenzo)
	{
		this.Comenzo = IsComenzo;
	}
	public boolean ComprobarBotones(JButton btn1, JButton btn2,JButton btn3,JButton btn4,JButton btn5,JButton btn6,JButton btn7,JButton btn8,JButton btn9,JButton btn10,JButton btn11, JButton btn12,JButton btn13,JButton btn14,JButton btn15,JButton btn16,JButton btn17,JButton btn18,JButton btn19,JButton btn20,JButton btn21, JButton btn22,JButton btn23,JButton btn24)
	{
		
		if(btn1.getText()!="0")
		{
			return false;
		}
		if(btn2.getText()!="1")
		{
			return false;
		}
		/*if(btn3.getText()!="2")
		{
			return false;
		}*/
		if(btn4.getText()!="3")
		{
			return false;
		}
		if(btn5.getText()!="4")
		{
			return false;
		}
		if(btn6.getText()!="5")
		{
			return false;
		}
		if(btn7.getText()!="6")
		{
			return false;
		}
		if(btn8.getText()!="7")
		{
			return false;
		}
		if(btn9.getText()!="8")
		{
			return false;
		}
		if(btn10.getText()!="9")
		{
			return false;
		}
		/*if(btn11.getText()!="10")
		{
			return false;
		}*/
		if(btn12.getText()!="11")
		{
			return false;
		}
		if(btn13.getText()!="12")
		{
			return false;
		}
		if(btn14.getText()!="13")
		{
			return false;
		}
		if(btn15.getText()!="14")
		{
			return false;
		}
		if(btn16.getText()!="15")
		{
			return false;
		}
		if(btn17.getText()!="16")
		{
			
			return false;
		}
		if(btn18.getText()!="17")
		{
			return false;
		}
		if(btn19.getText()!="18")
		{
			return false;
		}
		/*if(btn20.getText()!="19")
		{
			return false;
		}*/
		/*if(btn21.getText()!="20")
		{
			return false;
		}*/
		if(btn22.getText()!="21")
		{
			return false;
		}
		if(btn23.getText()!="22")
		{
			return false;
		}
		if(btn24.getText()!="23")
		{
			return false;
		}
		return true;
		
		
	}
	public boolean ValoresBien(JButton btn1, JButton btn2,JButton btn3,JButton btn4,JButton btn5,JButton btn6,JButton btn7,JButton btn8,JButton btn9,JButton btn10,JButton btn11, JButton btn12,JButton btn13,JButton btn14,JButton btn15,JButton btn16,JButton btn17,JButton btn18,JButton btn19,JButton btn20,JButton btn21, JButton btn22,JButton btn23,JButton btn24)
	{
		int a = Integer.valueOf(btn1.getText());
		int b = Integer.valueOf(btn2.getText());
		int c = Integer.valueOf(btn3.getText());
		int d = Integer.valueOf(btn4.getText());
		int e = Integer.valueOf(btn5.getText());
		int f = Integer.valueOf(btn6.getText());
		int g = Integer.valueOf(btn7.getText());
		int h = Integer.valueOf(btn8.getText());
		int i = Integer.valueOf(btn9.getText());
		int j = Integer.valueOf(btn10.getText());
		int k = Integer.valueOf(btn11.getText());
		int l = Integer.valueOf(btn12.getText());
		int m = Integer.valueOf(btn13.getText());
		int n = Integer.valueOf(btn14.getText());
		int o = Integer.valueOf(btn15.getText());
		int p = Integer.valueOf(btn16.getText());
		int q = Integer.valueOf(btn17.getText());
		int r = Integer.valueOf(btn18.getText());
		int s = Integer.valueOf(btn19.getText());
		int t = Integer.valueOf(btn20.getText());
		int u = Integer.valueOf(btn21.getText());
		int x = Integer.valueOf(btn22.getText());
		int y = Integer.valueOf(btn23.getText());
		int z = Integer.valueOf(btn24.getText());
		if(a<b&&b<c&&c<d&&d<e&&e<f&&f<g&&g<h&&h<i&&i<j&&j<k&&k<l&&l<m&&m<n&&n<o&&o<p&&p<q&&q<r&&r<s&&s<t&&t<u&&u<x&&x<y&&y<z)
		{
			return true;
		}
		return false;
	}
}

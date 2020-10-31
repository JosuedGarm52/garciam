
package Source;


import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import PaquetesExtra.JButtonP;
import PaquetesExtra.Comprobar;
import PaquetesExtra.base;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Puzzle extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Puzzle frame = new Puzzle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Puzzle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RompeCabezas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(143, 11, 112, 14);
		contentPane.add(lblNewLabel);
		base B = new base();
		JPanel panel = new JPanel(	);
		panel.setBounds(10, 36, 414, 178);
		contentPane.add(panel);
		panel.setLayout(null);
		Comprobar cc1 = new Comprobar();
		JButtonP btnBoton1 = new JButtonP("x");
		JButtonP btnBoton2 = new JButtonP("x");
		JButtonP btnBoton3 = new JButtonP("x");
		JButtonP btnBoton4 = new JButtonP("x");
		JButtonP btnBoton5 = new JButtonP("x");
		JButtonP btnBoton6 = new JButtonP("x");
		JButtonP btnBoton7 = new JButtonP("x");
		JButtonP btnBoton8 = new JButtonP("x");
		JButtonP btnBoton9 = new JButtonP("x");
		JButtonP btnBoton10 = new JButtonP("x");
		JButtonP btnBoton11 = new JButtonP("x");
		JButtonP btnBoton12 = new JButtonP("x");
		JButtonP btnBoton13 = new JButtonP("x");
		JButtonP btnBoton14_1 = new JButtonP("x");
		JButtonP btnBoton15 = new JButtonP("x");
		JButtonP btnBoton16 = new JButtonP("x");
		JButtonP btnBoton17 = new JButtonP("x");
		JButtonP btnBoton18 = new JButtonP("x");
		JButtonP btnBoton19 = new JButtonP("x");
		JButtonP btnBoton20 = new JButtonP("x");
		JButtonP btnBoton21 = new JButtonP("x");
		JButtonP btnBoton22 = new JButtonP("x");
		JButtonP btnBoton23 = new JButtonP("x");
		JButtonP btnBoton24 = new JButtonP("x");
		JButtonP btnBotonBase = new JButtonP("x");
		btnBotonBase.setIsBase(true);
		btnBotonBase.setColorNormal(Color.BLUE);
		btnBoton1.setBounds(10, 11, 64, 23);btnBoton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton2.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton1.getText());
						btnBoton1.setText(btnBoton2.getText());
						btnBoton2.setText(temporal.getText());
						btnBoton1.setIsBase(true);
						btnBoton2.setIsBase(false);
					}
					if(btnBoton6.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton1.getText());
						btnBoton1.setText(btnBoton6.getText());
						btnBoton6.setText(temporal.getText());
						btnBoton1.setIsBase(true);
						btnBoton6.setIsBase(false);
					}
					
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		panel.add(btnBoton1);
		
		btnBoton10.setBounds(10, 11, 64, 23);btnBoton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton5.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton10.getText());
						btnBoton10.setText(btnBoton5.getText());
						btnBoton5.setText(temporal.getText());
						btnBoton10.setIsBase(true);
						btnBoton5.setIsBase(false);
					}
					if(btnBoton9.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton10.getText());
						btnBoton10.setText(btnBoton9.getText());
						btnBoton9.setText(temporal.getText());
						btnBoton10.setIsBase(true);
						btnBoton9.setIsBase(false);
					}
					if(btnBoton15.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton10.getText());
						btnBoton10.setText(btnBoton15.getText());
						btnBoton15.setText(temporal.getText());
						btnBoton10.setIsBase(true);
						btnBoton15.setIsBase(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton10.setBounds(332, 47, 72, 23);
		panel.add(btnBoton10);
		
		
		btnBoton15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cc1.Comenzo)
				{
					if(btnBoton10.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton15.getText());
						btnBoton15.setText(btnBoton10.getText());
						btnBoton10.setText(temporal.getText());
						btnBoton15.setIsBase(true);
						btnBoton10.setIsBase(false);
					}
					if(btnBoton14_1.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton15.getText());
						btnBoton15.setText(btnBoton14_1.getText()); 
						btnBoton14_1.setText(temporal.getText()); 
						btnBoton15.setIsBase(true);
						btnBoton14_1.setIsBase(false);
						
					}
					if(btnBoton20.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton15.getText());
						btnBoton15.setText(btnBoton20.getText());
						btnBoton20.setText(temporal.getText());
						btnBoton15.setIsBase(true);
						btnBoton20.setIsBase(false);
					}
					
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton15 .setBounds(332, 81, 72, 23);
		panel.add(btnBoton15 );
		
		
		btnBoton20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton15.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton20.getText());
						btnBoton20.setText(btnBoton15.getText());
						btnBoton15.setText(temporal.getText());
						btnBoton20.setIsBase(true);
						btnBoton15.setIsBase(false);
					}
					if(btnBoton19.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton20.getText());
						btnBoton20.setText(btnBoton19.getText());
						btnBoton19.setText(temporal.getText());
						btnBoton20.setIsBase(true);
						btnBoton19.setIsBase(false);
					}
					if(btnBotonBase.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton20.getText());
						btnBoton20.setText(btnBotonBase.getText());
						btnBotonBase.setText(temporal.getText());
						btnBoton20.setIsBase(true);
						btnBotonBase.setIsBase(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton20.setBounds(332, 112, 72, 23);
		panel.add(btnBoton20);
		
		btnBoton24.addActionListener(new ActionListener() {//pruebbba
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton19.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton24.getText());
						btnBoton24.setText(btnBoton19.getText());
						btnBoton19.setText(temporal.getText());
						btnBoton24.setIsBase(true);
						btnBoton19.setIsBase(false);
					}
					if(btnBoton23.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton24.getText());
						btnBoton24.setText(btnBoton23.getText());
						btnBoton23.setText(temporal.getText());
						btnBoton24.setIsBase(true);
						btnBoton23.setIsBase(false);
					}
					if(btnBotonBase.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton24.getText());
						btnBoton24.setText(btnBotonBase.getText());
						btnBotonBase.setText(temporal.getText());
						btnBoton24.setIsBase(true);
						btnBotonBase.setIsBase(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton24.setBounds(250, 146, 74, 23);
		panel.add(btnBoton24);
		
		
		btnBoton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton1.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton2.getText());
						btnBoton2.setText(btnBoton1.getText());
						btnBoton1.setText(temporal.getText());
						btnBoton2.setIsBase(true);
						btnBoton1.setIsBase(false);
					}
					if(btnBoton7.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton1.getText());
						btnBoton2.setText(btnBoton7.getText());
						btnBoton7.setText(temporal.getText());
						btnBoton2.setIsBase(true);
						btnBoton7.setIsBase(false);
					}
					if(btnBoton3.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton2.getText());
						btnBoton2.setText(btnBoton3.getText());
						btnBoton3.setText(temporal.getText());
						btnBoton2.setIsBase(true);
						btnBoton3.setIsBase(false);
					}
					
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton2.setBounds(84, 11, 74, 23);
		panel.add(btnBoton2);
		
		
		btnBoton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton2.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton3.getText());
						btnBoton3.setText(btnBoton2.getText());
						btnBoton2.setText(temporal.getText());
						btnBoton3.setIsBase(true);
						btnBoton2.setIsBase(false);
					}
					if(btnBoton8.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton3.getText());
						btnBoton3.setText(btnBoton8.getText());
						btnBoton8.setText(temporal.getText());
						btnBoton3.setIsBase(true);
						btnBoton8.setIsBase(false);
					}
					if(btnBoton4.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton3.getText());
						btnBoton3.setText(btnBoton4.getText());
						btnBoton4.setText(temporal.getText());
						btnBoton3.setIsBase(true);
						btnBoton4.setIsBase(false);
					}
					
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton3.setBounds(168, 11, 72, 23);
		panel.add(btnBoton3);
		
		
		btnBoton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton3.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton4.getText());
						btnBoton4.setText(btnBoton3.getText());
						btnBoton3.setText(temporal.getText());
						btnBoton4.setIsBase(true);
						btnBoton3.setIsBase(false);
					}
					if(btnBoton9.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton4.getText());
						btnBoton4.setText(btnBoton9.getText());
						btnBoton9.setText(temporal.getText());
						btnBoton4.setIsBase(true);
						btnBoton9.setIsBase(false);
					}
					if(btnBoton5.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton4.getText());
						btnBoton4.setText(btnBoton5.getText());
						btnBoton5.setText(temporal.getText());
						btnBoton4.setIsBase(true);
						btnBoton5.setIsBase(false);
					}
					
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton4.setBounds(250, 11, 72, 23);
		panel.add(btnBoton4);
		
		
		btnBoton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton4.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton5.getText());
						btnBoton5.setText(btnBoton4.getText());
						btnBoton4.setText(temporal.getText());
						btnBoton5.setIsBase(true);
						btnBoton4.setIsBase(false);
					}
					if(btnBoton10.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton5.getText());
						btnBoton5.setText(btnBoton10.getText());
						btnBoton10.setText(temporal.getText());
						btnBoton5.setIsBase(true);
						btnBoton10.setIsBase(false);
					}
					
					
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton5.setBounds(332, 11, 72, 23);
		panel.add(btnBoton5);
		
		
		btnBoton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton1.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton6.getText());
						btnBoton6.setText(btnBoton1.getText());
						btnBoton1.setText(temporal.getText());
						btnBoton6.setIsBase(true);
						btnBoton1.setIsBase(false);
					}
					if(btnBoton7.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton6.getText());
						btnBoton6.setText(btnBoton7.getText());
						btnBoton7.setText(temporal.getText());
						btnBoton6.setIsBase(true);
						btnBoton7.setIsBase(false);
					}
					if(btnBoton11.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton6.getText());
						btnBoton6.setText(btnBoton11.getText());
						btnBoton11.setText(temporal.getText());
						btnBoton6.setIsBase(true);
						btnBoton11.setIsBase(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton6.setBounds(10, 45, 64, 23);
		panel.add(btnBoton6);
		
		btnBoton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton2.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton7.getText());
						btnBoton7.setText(btnBoton2.getText());
						btnBoton2.setText(temporal.getText());
						btnBoton7.setIsBase(true);
						btnBoton2.setIsBase(false);
					}
					if(btnBoton6.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton7.getText());
						btnBoton7.setText(btnBoton6.getText());
						btnBoton6.setText(temporal.getText());
						btnBoton7.setIsBase(true);
						btnBoton6.setIsBase(false);
					}
					if(btnBoton8.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton7.getText());
						btnBoton7.setText(btnBoton8.getText());
						btnBoton8.setText(temporal.getText());
						btnBoton7.setIsBase(true);
						btnBoton8.setIsBase(false);
					}if(btnBoton12.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton7.getText());
						btnBoton7.setText(btnBoton12.getText());
						btnBoton12.setText(temporal.getText());
						btnBoton7.setIsBase(true);
						btnBoton12.setIsBase(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton7.setBounds(84, 45, 74, 23);
		panel.add(btnBoton7);
		
		
		btnBoton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton3.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton8.getText());
						btnBoton8.setText(btnBoton3.getText());
						btnBoton3.setText(temporal.getText());
						btnBoton8.setIsBase(true);
						btnBoton3.setIsBase(false);
					}
					if(btnBoton7.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton8.getText());
						btnBoton8.setText(btnBoton7.getText());
						btnBoton7.setText(temporal.getText());
						btnBoton8.setIsBase(true);
						btnBoton7.setIsBase(false);
					}
					if(btnBoton9.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton8.getText());
						btnBoton8.setText(btnBoton9.getText());
						btnBoton9.setText(temporal.getText());
						btnBoton8.setIsBase(true);
						btnBoton9.setIsBase(false);
					}
					if(btnBoton13.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton8.getText());
						btnBoton8.setText(btnBoton13.getText());
						btnBoton13.setText(temporal.getText());
						btnBoton8.setIsBase(true);
						btnBoton13.setIsBase(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton8.setBounds(168, 45, 72, 23);
		panel.add(btnBoton8);
		
		
		btnBoton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton6.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton11.getText());
						btnBoton11.setText(btnBoton6.getText());
						btnBoton6.setText(temporal.getText());
						btnBoton11.setIsBase(true);
						btnBoton6.setIsBase(false);
					}
					if(btnBoton12.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton11.getText());
						btnBoton11.setText(btnBoton12.getText());
						btnBoton12.setText(temporal.getText());
						btnBoton11.setIsBase(true);
						btnBoton12.setIsBase(false);
					}
					if(btnBoton16.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton11.getText());
						btnBoton11.setText(btnBoton16.getText());
						btnBoton16.setText(temporal.getText());
						btnBoton11.setIsBase(true);
						btnBoton16.setIsBase(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton11.setBounds(10, 81, 64, 23);
		panel.add(btnBoton11);
		
		
		btnBoton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton11.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton12.getText());
						btnBoton12.setText(btnBoton11.getText());
						btnBoton11.setText(temporal.getText());
						btnBoton12.setIsBase(true);
						btnBoton11.setIsBase(false);
					}
					if(btnBoton7.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton12.getText());
						btnBoton12.setText(btnBoton7.getText());
						btnBoton7.setText(temporal.getText());
						btnBoton12.setIsBase(true);
						btnBoton7.setIsBase(false);
					}
					if(btnBoton13.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton12.getText());
						btnBoton12.setText(btnBoton13.getText());
						btnBoton13.setText(temporal.getText());
						btnBoton12.setIsBase(true);
						btnBoton13.setIsBase(false);
					}
					if(btnBoton17.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton12.getText());
						btnBoton12.setText(btnBoton17.getText());
						btnBoton17.setText(temporal.getText());
						btnBoton12.setIsBase(true);
						btnBoton17.setIsBase(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton12.setBounds(84, 81, 74, 23);
		panel.add(btnBoton12);
		btnBoton13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton12.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton13.getText());
						btnBoton13.setText(btnBoton12.getText());
						btnBoton12.setText(temporal.getText());
						btnBoton13.setIsBase(true);
						btnBoton12.setIsBase(false);
					}
					if(btnBoton8.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton13.getText());
						btnBoton13.setText(btnBoton8.getText());
						btnBoton8.setText(temporal.getText());
						btnBoton13.setIsBase(true);
						btnBoton8.setIsBase(false);
					}
					if(btnBoton14_1.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton13.getText());
						btnBoton13.setText(btnBoton14_1.getText());
						btnBoton14_1.setText(temporal.getText());
						btnBoton13.setIsBase(true);
						btnBoton14_1.setIsBase(false);
					}
					if(btnBoton18.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton13.getText());
						btnBoton13.setText(btnBoton18.getText());
						btnBoton18.setText(temporal.getText());
						btnBoton13.setIsBase(true);
						btnBoton18.setIsBase(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton13.setBounds(168, 81, 72, 23);
		panel.add(btnBoton13);
		
		
		btnBoton16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton11.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton16.getText());
						btnBoton16.setText(btnBoton11.getText());
						btnBoton11.setText(temporal.getText());
						btnBoton16.setIsBase(true);
						btnBoton11.setIsBase(false);
					}
					if(btnBoton17.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton16.getText());
						btnBoton16.setText(btnBoton17.getText());
						btnBoton17.setText(temporal.getText());
						btnBoton16.setIsBase(true);btnBoton17.setIsBase(false);
					}
					if(btnBoton21.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton16.getText());
						btnBoton16.setText(btnBoton21.getText());
						btnBoton21.setText(temporal.getText());
						btnBoton16.setIsBase(true);
						btnBoton21.setIsBase(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton16.setBounds(10, 115, 64, 23);
		panel.add(btnBoton16);
		
		btnBoton17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton12.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton17.getText());
						btnBoton17.setText(btnBoton12.getText());
						btnBoton12.setText(temporal.getText());
						btnBoton17.setIsBase(true);
						btnBoton12.setIsBase(false);
					}
					if(btnBoton18.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton17.getText());
						btnBoton17.setText(btnBoton18.getText());
						btnBoton18.setText(temporal.getText());
						btnBoton17.setIsBase(true);
						btnBoton18.setIsBase(false);
					}if(btnBoton16.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton17.getText());
						btnBoton17.setText(btnBoton16.getText());
						btnBoton16.setText(temporal.getText());
						btnBoton17.setIsBase(true);
						btnBoton16.setIsBase(false);
					}
					if(btnBoton22.getIsBase())//conflicto
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton17.getText());
						btnBoton17.setText(btnBoton22.getText());
						btnBoton22.setText(temporal.getText());
						btnBoton17.setIsBase(true);
						btnBoton22.setIsBase(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton17.setBounds(84, 115, 74, 23);
		panel.add(btnBoton17);
		
		
		btnBoton18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton13.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton18.getText());
						btnBoton18.setText(btnBoton13.getText());
						btnBoton13.setText(temporal.getText());
						btnBoton18.setIsBase(true);
						btnBoton13.setIsBase(false);
					}
					if(btnBoton19.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton18.getText());
						btnBoton18.setText(btnBoton19.getText());
						btnBoton19.setText(temporal.getText());
						btnBoton18.setIsBase(true);
						btnBoton19.setIsBase(false);
					}
					if(btnBoton17.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton18.getText());
						btnBoton18.setText(btnBoton17.getText());
						btnBoton17.setText(temporal.getText());
						btnBoton18.setIsBase(true);
						btnBoton17.setIsBase(false);
					}
					if(btnBoton23.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton18.getText());
						btnBoton18.setText(btnBoton23.getText());
						btnBoton23.setText(temporal.getText());
						btnBoton18.setIsBase(true);
						btnBoton23.setIsBase(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton18.setBounds(168, 115, 72, 23);
		panel.add(btnBoton18);
		
		
		btnBoton21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton16.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton21.getText());
						btnBoton21.setText(btnBoton16.getText());
						btnBoton16.setText(temporal.getText());
						btnBoton21.setIsBase(true);
						btnBoton16.setIsBase(false);
					}
					if(btnBoton22.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton21.getText());
						btnBoton21.setText(btnBoton22.getText());
						btnBoton22.setText(temporal.getText());
						btnBoton21.setIsBase(true);
						btnBoton22.setIsBase(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton21.setBounds(10, 146, 64, 23);
		panel.add(btnBoton21);
		
		btnBoton22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton17.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton22.getText());
						btnBoton22.setText(btnBoton17.getText());
						btnBoton17.setText(temporal.getText());
						btnBoton22.setIsBase(true);
						btnBoton17.setIsBase(false);
					}
					if(btnBoton21.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton22.getText());
						btnBoton22.setText(btnBoton21.getText());
						btnBoton21.setText(temporal.getText());
						btnBoton22.setIsBase(true);
						btnBoton21.setIsBase(false);
					}
					if(btnBoton23.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton22.getText());
						btnBoton22.setText(btnBoton23.getText());
						btnBoton23.setText(temporal.getText());
						btnBoton22.setIsBase(true);
						btnBoton23.setIsBase(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton22.setBounds(84, 146, 74, 23);
		panel.add(btnBoton22);
		
		btnBoton23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton18.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton23.getText());
						btnBoton23.setText(btnBoton18.getText());
						btnBoton18.setText(temporal.getText());
						btnBoton23.setIsBase(true);
						btnBoton18.setIsBase(false);
					}
					if(btnBoton22.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton23.getText());
						btnBoton23.setText(btnBoton22.getText());
						btnBoton22.setText(temporal.getText());
						btnBoton23.setIsBase(true);
						btnBoton22.setIsBase(false);
					}
					if(btnBoton24.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton23.getText());
						btnBoton23.setText(btnBoton24.getText());
						btnBoton24.setText(temporal.getText());
						btnBoton23.setIsBase(true);
						btnBoton24.setIsBase(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton23.setBounds(168, 146, 72, 23);
		panel.add(btnBoton23);
		
		
		btnBoton19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton14_1.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton19.getText());
						btnBoton19.setText(btnBoton14_1.getText());
						btnBoton14_1.setText(temporal.getText());
						btnBoton19.setIsBase(true);
						btnBoton14_1.setIsBase(false);
					}
					if(btnBoton18.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton19.getText());
						btnBoton19.setText(btnBoton18.getText());
						btnBoton18.setText(temporal.getText());
						btnBoton19.setIsBase(true);
						btnBoton18.setIsBase(false);
					}
					if(btnBoton24.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton19.getText());
						btnBoton19.setText(btnBoton24.getText());
						btnBoton24.setText(temporal.getText());
						btnBoton19.setIsBase(true);
						btnBoton24.setIsBase(false);
					}
					if(btnBoton20.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton19.getText());
						btnBoton19.setText(btnBoton20.getText());
						btnBoton20.setText(temporal.getText());
						btnBoton19.setIsBase(true);
						btnBoton20.setIsBase(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
				
			}
		});
		btnBoton19.setBounds(250, 115, 72, 23);
		panel.add(btnBoton19);
		//JButtonP btnBotonBase = new JButtonP("x");
		btnBotonBase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton20.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBotonBase.getText());
						btnBotonBase.setText(btnBoton20.getText());
						btnBoton20.setText(temporal.getText());
						btnBotonBase.setIsBase(true);
						btnBoton20.setIsBase(false);
					}
					if(btnBoton24.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBotonBase.getText());
						btnBotonBase.setText(btnBoton24.getText());
						btnBoton24.setText(temporal.getText());
						btnBotonBase.setIsBase(true);
						btnBoton24.setIsBase(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		//btnBotonBase.setVisible(false);
		btnBotonBase.setEnabled(true);
		btnBotonBase.setBounds(330, 146, 74, 23);
		B.dato = btnBotonBase;
		panel.add(btnBotonBase);
		//JButtonP btnBoton14_1 = new JButtonP("x");
		btnBoton14_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton9.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton14_1.getText());
						btnBoton14_1.setText(btnBoton9.getText());
						btnBoton9.setText(temporal.getText());
						btnBoton14_1.setIsBase(true);
						btnBoton9.setIsBase(false);
					}
					if(btnBoton13.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton14_1.getText());
						btnBoton14_1.setText(btnBoton13.getText());
						btnBoton13.setText(temporal.getText());
						btnBoton14_1.setIsBase(true);
						btnBoton13.setIsBase(false);
					}
					if(btnBoton19.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton14_1.getText());
						btnBoton14_1.setText(btnBoton19.getText());
						btnBoton19.setText(temporal.getText());
						btnBoton14_1.setIsBase(true);
						btnBoton19.setIsBase(false);
					}
					if(btnBoton15.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton14_1.getText());
						btnBoton14_1.setText(btnBoton15.getText());
						btnBoton15.setText(temporal.getText());
						btnBoton14_1.setIsBase(true);
						btnBoton15.setIsBase(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton14_1.setBounds(250, 81, 72, 23);
		panel.add(btnBoton14_1);
		
		
		btnBoton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cc1.Comenzo)
				{
					if(btnBoton4.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton9.getText());
						btnBoton9.setText(btnBoton4.getText());
						btnBoton4.setText(temporal.getText());
						btnBoton9.setIsBase(true);
						btnBoton4.setIsBase(false);
					}
					if(btnBoton8.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton9.getText());
						btnBoton9.setText(btnBoton8.getText());
						btnBoton8.setText(temporal.getText());
						btnBoton9.setIsBase(true);
						btnBoton8.setIsBase(false);
					}
					if(btnBoton14_1.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton9.getText());
						btnBoton9.setText(btnBoton14_1.getText());
						btnBoton14_1.setText(temporal.getText());
						btnBoton9.setIsBase(true);
						btnBoton14_1.setIsBase(false);
					}
					if(btnBoton10.getIsBase())
					{
						JButton temporal = new JButton();
						temporal.setText(btnBoton9.getText());
						btnBoton9.setText(btnBoton10.getText());
						btnBoton10.setText(temporal.getText());
						btnBoton9.setIsBase(true);
						btnBoton10.setIsBase(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(null, "Por favor, pulse primero *Generar*");
				}
			}
		});
		btnBoton9.setBounds(250, 47, 72, 23);
		panel.add(btnBoton9);
		Random random = new Random();
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				btnGenerar.setEnabled(false);
				cc1.getComenzo(true);
				//Comprobar cc = new Comprobar();
				//boolean b= cc.ComprobarBotones(btnBoton1, btnBoton2, btnBoton4, btnBoton4, btnBoton5, btnBoton6, btnBoton7, btnBoton8, btnBoton9, btnBoton10, btnBoton16, btnBoton12, btnBoton13, btnBoton14_1, btnBoton15 , btnBoton16, btnBoton17, btnBoton18, btnBoton19, btnBoton9, btnBotonBase, btnBoton22, btnBoton23, btnBoton24);
				
				{
				int num=0;
				try
				{
					//while(Numbers.size()<=20)//iter.hasPrevious())
					Set<Integer> Numbers = new HashSet<>();
						while(num<25)//24 25bien
						{
						 int randomNumber = random.nextInt(26);//25,24
						 JButtonP boton = (JButtonP)AsignarBoton(num);
						 
						 if(boton.getText()=="x")
						 {

							 if(!Numbers.contains(randomNumber))
							 {
								 
									 String numCadena= randomNumber+"";
									 boton.setText(numCadena);
									 Numbers.add(randomNumber);
									 num++;
							 }else
							 {
								 randomNumber = random.nextInt(24);
							 }
						
						}
					}
				}catch(Exception ex)
				{
					ex.printStackTrace();
				}
				/*for(int x = 0;x<23;x++)
				{
					JButton boton = (JButton)AsignarBoton(num);
					if(boton.getText()!="x")
					{
						b++;
					}
				}
				}while(b==23);*/
				}
			}

			private Component AsignarBoton(int num) {
				// TODO Auto-generated method stub
				return panel.getComponent(num);
			}
		});
		
		btnGenerar.setBounds(20, 225, 89, 23);
		contentPane.add(btnGenerar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				/*boton para cerrar ventana*/
				System.exit(WIDTH);
			}
		});
		btnSalir.setBounds(323, 225, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{ 
				boolean b= cc1.ComprobarBotones(btnBoton1, btnBoton2, btnBoton4, btnBoton4, btnBoton5, btnBoton6, btnBoton7, btnBoton8, btnBoton9, btnBoton10, btnBoton16, btnBoton12, btnBoton13, btnBoton14_1, btnBoton15 , btnBoton16, btnBoton17, btnBoton18, btnBoton19, btnBoton9, btnBotonBase, btnBoton22, btnBoton23, btnBoton24);
				try
				{
				if(b)
				{
					JOptionPane.showMessageDialog(null, "Bien Hecho!!!!");
				}else
				{
					JOptionPane.showMessageDialog(null, "vuelve a intentarlo");
				}
				}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Error");
					ex.printStackTrace();
				}
				
			}
		});
		btnComprobar.setBounds(143, 225, 140, 23);
		contentPane.add(btnComprobar);
		
		JButton btnNewButton = new JButton("Admin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				cc1.vv++;
				if(cc1.vv==3)
				{
					btnBoton1.setText("0");
					btnBoton2.setText("1");
					btnBoton3.setText("2");
					btnBoton4.setText("3");
					btnBoton5.setText("4");
					btnBoton6.setText("5");
					btnBoton7.setText("6");
					btnBoton8.setText("7");
					btnBoton9.setText("8");
					btnBoton10.setText("9");
					btnBoton11.setText("10");
					btnBoton12.setText("11");
					btnBoton13.setText("12");
				  btnBoton14_1.setText("13");
					btnBoton15.setText("14");
					btnBoton16.setText("15");
					btnBoton17.setText("16");
					btnBoton18.setText("17");
					btnBoton19.setText("18");
					btnBoton20.setText("19");
					btnBoton21.setText("20");
					btnBoton22.setText("21");
					btnBoton23.setText("22");
					btnBoton24.setText("23");
					btnBotonBase.setText("x");
					cc1.getComenzo(true);
				}
			}

			});
		btnNewButton.setBounds(323, 7, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
}

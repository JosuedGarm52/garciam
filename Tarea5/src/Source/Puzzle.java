package Source;


import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.awt.event.ActionEvent;

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
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 36, 414, 178);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnBoton1 = new JButton("x");
		btnBoton1.setBounds(10, 11, 64, 23);
		panel.add(btnBoton1);
		
		JButton btnBoton10 = new JButton("x");
		btnBoton10.setBounds(332, 47, 72, 23);
		panel.add(btnBoton10);
		
		JButton btnBoton15 = new JButton("x");
		btnBoton15.setBounds(332, 81, 72, 23);
		panel.add(btnBoton15);
		
		JButton btnBoton20 = new JButton("x");
		btnBoton20.setBounds(332, 112, 72, 23);
		panel.add(btnBoton20);
		
		JButton btnBoton24 = new JButton("x");
		btnBoton24.setBounds(250, 146, 74, 23);
		panel.add(btnBoton24);
		
		JButton btnBoton2 = new JButton("x");
		btnBoton2.setBounds(84, 11, 74, 23);
		panel.add(btnBoton2);
		
		JButton btnBoton3 = new JButton("x");
		btnBoton3.setBounds(168, 11, 72, 23);
		panel.add(btnBoton3);
		
		JButton btnBoton4 = new JButton("x");
		btnBoton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBoton4.setBounds(250, 11, 72, 23);
		panel.add(btnBoton4);
		
		JButton btnBoton5 = new JButton("x");
		btnBoton5.setBounds(332, 11, 72, 23);
		panel.add(btnBoton5);
		
		JButton btnBoton6 = new JButton("x");
		btnBoton6.setBounds(10, 45, 64, 23);
		panel.add(btnBoton6);
		
		JButton btnBoton7 = new JButton("x");
		btnBoton7.setBounds(84, 45, 74, 23);
		panel.add(btnBoton7);
		
		JButton btnBoton8 = new JButton("x");
		btnBoton8.setBounds(168, 45, 72, 23);
		panel.add(btnBoton8);
		
		JButton btnBoton11 = new JButton("x");
		btnBoton11.setBounds(10, 81, 64, 23);
		panel.add(btnBoton11);
		
		JButton btnBoton12 = new JButton("x");
		btnBoton12.setBounds(84, 81, 74, 23);
		panel.add(btnBoton12);
		
		JButton btnBoton13 = new JButton("x");
		btnBoton13.setBounds(168, 81, 72, 23);
		panel.add(btnBoton13);
		
		JButton btnBoton16 = new JButton("x");
		btnBoton16.setBounds(10, 115, 64, 23);
		panel.add(btnBoton16);
		
		JButton btnBoton17 = new JButton("x");
		btnBoton17.setBounds(84, 115, 74, 23);
		panel.add(btnBoton17);
		
		JButton btnBoton18 = new JButton("x");
		btnBoton18.setBounds(168, 115, 72, 23);
		panel.add(btnBoton18);
		
		JButton btnBoton21 = new JButton("x");
		btnBoton21.setBounds(10, 146, 64, 23);
		panel.add(btnBoton21);
		
		JButton btnBoton22 = new JButton("x");
		btnBoton22.setBounds(84, 146, 74, 23);
		panel.add(btnBoton22);
		
		JButton btnBoton23 = new JButton("x");
		btnBoton23.setBounds(168, 146, 72, 23);
		panel.add(btnBoton23);
		
		JButton btnBoton9 = new JButton("x");
		btnBoton9.setBounds(250, 47, 72, 23);
		panel.add(btnBoton9);
		
		JButton btnBoton14 = new JButton("x");
		btnBoton14.setBounds(250, 81, 72, 23);
		panel.add(btnBoton14);
		
		JButton btnBoton19 = new JButton("x");
		btnBoton19.setBounds(250, 112, 72, 23);
		panel.add(btnBoton19);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//Randoming random = new Randoming();
				//ListIterator<Integer> iter = random.numbers.listIterator();
				int b=0;
				while(b<8)
				{
				Random random = new Random();
				Set<Integer> Numbers = new HashSet<>();
				int num=0;
				try
				{
					while(Numbers.size()<33)//iter.hasPrevious())
					{
						 int randomNumber = random.nextInt(23);
						if(!Numbers.contains(randomNumber))
						{
							JButton boton = (JButton)AsignarBoton(num);
							String numCadena= randomNumber+"";
							boton.setText(numCadena);
							Numbers.add(randomNumber);
						}
						num++;
					}
				}catch(Exception ex)
				{
					ex.printStackTrace();
				}
				b++;
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
		btnComprobar.setBounds(143, 225, 140, 23);
		contentPane.add(btnComprobar);
	}
}

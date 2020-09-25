package source;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		//DefaultListModel listModel;
		private JTextField textField_3;
	/**
	 * Create the frame.
	 */
	public ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Generar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				//listModel =new DefaultListModel();
				String texto1 = textField.getText();
				String texto2 =  textField_1.getText();
				
				int x=0,y=0;
				try
				{
					x = Integer.parseInt(texto1);
					y = Integer.parseInt(texto2);
				}catch(NumberFormatException ex)
				{
					System.err.println("No se puede convertir a numero");
					ex.printStackTrace();
				}
					textField_3.setText(texto1+" \n"+texto2+" \n");
					
		        int m = Integer.parseInt(textField_2.getText());
		        int a=1;
		        while(a<m)
		        {
		            int z= x+y;
		            String anterior = textField_3.getText();
		            textField_3.setText(anterior+" \n"+z);
		            x=y;
		            y=z;
		            a++;
		        }
			}
		});
		btnNewButton.setBounds(313, 137, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				System.out.println("Limpiado");
				
			}
		});
		btnNewButton_1.setBounds(313, 185, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				/*boton para cerrar ventana*/
				System.exit(WIDTH);
			}
		});
		btnNewButton_2.setBounds(313, 232, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Valor inicial 1");
		lblNewLabel.setBounds(43, 24, 109, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(162, 21, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 52, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Valor inicial 2");
		lblNewLabel_1.setBounds(43, 55, 109, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Numero de iteraciones");
		lblNewLabel_2.setBounds(43, 94, 129, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(194, 91, 36, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(43, 137, 260, 118);
		textField_3.setEditable(false);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}

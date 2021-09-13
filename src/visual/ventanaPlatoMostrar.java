package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;

public class ventanaPlatoMostrar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPlatoMostrar frame = new ventanaPlatoMostrar();
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
	public ventanaPlatoMostrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBackground(new Color(135, 206, 235));
		btnAtras.setBounds(335, 11, 89, 23);
		contentPane.add(btnAtras);
		
		JButton btnInicio = new JButton("Inicio\r\n");
		btnInicio.setBackground(new Color(135, 206, 235));
		btnInicio.setBounds(335, 40, 89, 23);
		contentPane.add(btnInicio);
		
		JButton btnNewButton_1 = new JButton("Mostrar insumos consumidos\r\n");
		btnNewButton_1.setBackground(new Color(72, 209, 204));
		btnNewButton_1.setBounds(31, 23, 214, 23);
		contentPane.add(btnNewButton_1);
	}

}

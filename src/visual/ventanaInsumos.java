package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

public class ventanaInsumos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaInsumos frame = new ventanaInsumos();
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
	public ventanaInsumos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFactura = new JButton("Atras\r\n");
		btnFactura.setBackground(new Color(135, 206, 235));
		btnFactura.setBounds(335, 11, 89, 23);
		contentPane.add(btnFactura);
		
		JLabel lblNewLabel = new JLabel("Opciones de insumos que puedes crear:\r\n");
		lblNewLabel.setBounds(21, 15, 272, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnSalsa_ajo = new JButton("Salsa de ajo\r\n");
		btnSalsa_ajo.setBackground(new Color(175, 238, 238));
		btnSalsa_ajo.setBounds(20, 40, 125, 23);
		contentPane.add(btnSalsa_ajo);
		
		JButton btnSalsa_rosa = new JButton("Salsa rosada");
		btnSalsa_rosa.setBackground(new Color(175, 238, 238));
		btnSalsa_rosa.setBounds(21, 76, 125, 23);
		contentPane.add(btnSalsa_rosa);
		
		JButton btnTortilla = new JButton("Tortilla");
		btnTortilla.setBackground(new Color(175, 238, 238));
		btnTortilla.setBounds(195, 40, 125, 23);
		contentPane.add(btnTortilla);
		
		JButton btnGuacamole = new JButton("Guacamole");
		btnGuacamole.setBackground(new Color(175, 238, 238));
		btnGuacamole.setBounds(21, 110, 125, 23);
		contentPane.add(btnGuacamole);
		
		JButton btnSalsa_de_maiz = new JButton("Salsa de maiz\r\n");
		btnSalsa_de_maiz.setBackground(new Color(175, 238, 238));
		btnSalsa_de_maiz.setBounds(195, 76, 126, 23);
		contentPane.add(btnSalsa_de_maiz);
		
		JButton btnMostrar_insumos = new JButton("Mostrar insumos");
		btnMostrar_insumos.setBackground(new Color(72, 209, 204));
		btnMostrar_insumos.setBounds(21, 211, 145, 23);
		contentPane.add(btnMostrar_insumos);
	}

}

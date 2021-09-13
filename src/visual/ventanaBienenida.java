package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ventanaBienenida extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaBienenida frame = new ventanaBienenida();
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
	public ventanaBienenida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnInventario = new JButton("Inventario\r\n");
		btnInventario.setBackground(new Color(135, 206, 235));
		btnInventario.setBounds(22, 209, 106, 23);
		contentPane.add(btnInventario);
		
		JButton btnInsumos = new JButton("Insumos");
		btnInsumos.setBackground(new Color(135, 206, 235));
		btnInsumos.setBounds(148, 209, 89, 23);
		contentPane.add(btnInsumos);
		
		JButton btnPlatos = new JButton("Platos\r\n");
		btnPlatos.setBackground(new Color(135, 206, 235));
		btnPlatos.setToolTipText("");
		btnPlatos.setBounds(259, 209, 89, 23);
		contentPane.add(btnPlatos);
		
		JLabel lbImagen = new JLabel("");
		lbImagen.setIcon(new ImageIcon("C:\\Users\\Asus\\Documents\\Taller-de-lenguajes-de-programacion-1\\TrabajoFinal\\fotos\\restauranteLogo.png"));
		lbImagen.setBounds(66, 11, 208, 160);
		contentPane.add(lbImagen);
	}
}

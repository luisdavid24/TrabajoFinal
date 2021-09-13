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
import java.awt.Font;
import javax.swing.ImageIcon;

public class ventanaInventario extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textValor;
	private JTextField textNombre;
	private JTextField textCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaInventario frame = new ventanaInventario();
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
	public ventanaInventario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 377);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAtras = new JButton("Atras\r\n");
		btnAtras.setBackground(new Color(135, 206, 235));
		btnAtras.setBounds(408, 11, 89, 23);
		contentPane.add(btnAtras);
		
		textId = new JTextField();
		textId.setBounds(163, 89, 127, 20);
		contentPane.add(textId);
		textId.setColumns(10);
		
		JLabel lbId = new JLabel("Id:");
		lbId.setBounds(49, 92, 46, 14);
		contentPane.add(lbId);
		
		textValor = new JTextField();
		textValor.setBounds(163, 151, 127, 20);
		contentPane.add(textValor);
		textValor.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(163, 120, 127, 20);
		contentPane.add(textNombre);
		
		JLabel lbValor = new JLabel("Valor:");
		lbValor.setBounds(44, 154, 46, 14);
		contentPane.add(lbValor);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(44, 122, 65, 14);
		contentPane.add(lblNombre);
		
		textCantidad = new JTextField();
		textCantidad.setBounds(163, 182, 127, 20);
		contentPane.add(textCantidad);
		textCantidad.setColumns(10);
		
		JLabel lbCantidad = new JLabel("Cantidad");
		lbCantidad.setBounds(44, 190, 65, 14);
		contentPane.add(lbCantidad);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBackground(new Color(72, 209, 204));
		btnRegistrar.setBounds(34, 215, 89, 23);
		contentPane.add(btnRegistrar);
		
		JButton btnMostrar_inventario = new JButton("Mostrar Inventario");
		btnMostrar_inventario.setBackground(new Color(72, 209, 204));
		btnMostrar_inventario.setBounds(145, 215, 156, 23);
		contentPane.add(btnMostrar_inventario);
		
		JLabel lblMensajeFormulario = new JLabel("Llene el formulario para ingresar nuevos producto al inventario");
		lblMensajeFormulario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMensajeFormulario.setBounds(34, 45, 402, 34);
		contentPane.add(lblMensajeFormulario);
	}
}

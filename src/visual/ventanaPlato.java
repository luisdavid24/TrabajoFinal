package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventanaPlato extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPlato frame = new ventanaPlato();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ventanaPlato() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 346);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBackground(new Color(135, 206, 235));
		btnAtras.setBounds(389, 11, 89, 23);
		contentPane.add(btnAtras);
		
		JLabel lblNewLabel = new JLabel("Platos disponibles para seleccionar:");
		lblNewLabel.setBounds(10, 15, 253, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnTacos_mexicanos = new JButton("Tacos mexicanos");
		btnTacos_mexicanos.setBackground(new Color(175, 238, 238));
		btnTacos_mexicanos.setBounds(10, 40, 137, 23);
		contentPane.add(btnTacos_mexicanos);
		
		JButton btnQuesadillas = new JButton("Quesadillas");
		btnQuesadillas.setBackground(new Color(175, 238, 238));
		btnQuesadillas.setBounds(10, 98, 137, 23);
		contentPane.add(btnQuesadillas);
		
		JButton btnSopa_aztecas = new JButton("Sopa azteca\r\n");
		btnSopa_aztecas.setBackground(new Color(175, 238, 238));
		btnSopa_aztecas.setBounds(187, 70, 137, 23);
		contentPane.add(btnSopa_aztecas);
		
		JButton btnTotopos = new JButton("Totopos\r\n");
		btnTotopos.setBackground(new Color(175, 238, 238));
		btnTotopos.setBounds(10, 70, 137, 23);
		contentPane.add(btnTotopos);
		
		JButton btnTrompetas = new JButton("Trompetas");
		btnTrompetas.setBackground(new Color(175, 238, 238));
		btnTrompetas.setBounds(187, 40, 137, 23);
		contentPane.add(btnTrompetas);
		
		JButton btnCompra = new JButton("ver compra");
		btnCompra.setBackground(new Color(72, 209, 204));
		btnCompra.setBounds(125, 171, 105, 23);
		contentPane.add(btnCompra);
		
		JButton btnFinalizar = new JButton("Finalizar\r\n");
		btnFinalizar.setBackground(new Color(72, 209, 204));
		btnFinalizar.setBounds(10, 171, 105, 23);
		contentPane.add(btnFinalizar);
	}

}

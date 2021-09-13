package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ventanaBienenida extends JFrame implements ActionListener {

	private JPanel contentPane;
	JButton btnInventario,btnInsumos,btnPlatos;
	

	public ventanaBienenida() {
		iniciarComponent();
	}

	private void iniciarComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnInventario = new JButton("Inventario\r\n");
		btnInventario.setBackground(new Color(135, 206, 235));
		btnInventario.setBounds(22, 209, 106, 23);
		contentPane.add(btnInventario);
		btnInventario.addActionListener(this);
		
		btnInsumos = new JButton("Insumos");
		btnInsumos.setBackground(new Color(135, 206, 235));
		btnInsumos.setBounds(148, 209, 89, 23);
		contentPane.add(btnInsumos);
		btnInsumos.addActionListener(this);
		
		
		btnPlatos = new JButton("Platos\r\n");
		btnPlatos.setBackground(new Color(135, 206, 235));
		btnPlatos.setToolTipText("");
		btnPlatos.setBounds(259, 209, 89, 23);
		contentPane.add(btnPlatos);
		btnPlatos.addActionListener(this);
		
		JLabel lbImagen = new JLabel("");
		lbImagen.setIcon(new ImageIcon("fotos\\restauranteLogo.png"));
		lbImagen.setBounds(66, 11, 208, 160);
		contentPane.add(lbImagen);

	}

	public void actionPerformed(ActionEvent e) {
		if(btnInventario==e.getSource()) {
			ventanaInventario v3=new ventanaInventario();
			v3.setVisible(true);
			
			this.setVisible(false);
		}
		if(btnInsumos==e.getSource()) {
			ventanaInsumos v2=new ventanaInsumos();
			v2.setVisible(true);
			this.setVisible(false);
		}
		if(btnPlatos==e.getSource()) {
			ventanaPlato v4=new ventanaPlato();
			v4.setVisible(true);
			this.setVisible(false);
		}
	}
}

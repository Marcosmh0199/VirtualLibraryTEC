package control;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class VentanaAtencionPedidos extends JFrame {

	private JPanel contentPane;
	private JTextField txtcorreo;
	private JTextField txteléfono;
	private JTextField txtdireccion;
	private JTextField txtnombre;
	private JTextField txtcedula;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAtencionPedidos frame = new VentanaAtencionPedidos();
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
	public VentanaAtencionPedidos() {
		setTitle("Atenci\u00F3n de Pedidos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCdula = new JLabel("C\u00E9dula");
		lblCdula.setBounds(10, 11, 46, 14);
		contentPane.add(lblCdula);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 38, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(10, 63, 80, 14);
		contentPane.add(lblDireccin);
		
		JLabel lblTelefono = new JLabel("Tel\u00E9fono");
		lblTelefono.setBounds(10, 88, 96, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblCorreoElectrnico = new JLabel("Correo Electr\u00F3nico");
		lblCorreoElectrnico.setBounds(10, 113, 120, 14);
		contentPane.add(lblCorreoElectrnico);
		
		txtcorreo = new JTextField();
		txtcorreo.setEditable(false);
		txtcorreo.setBounds(140, 110, 218, 20);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		txteléfono = new JTextField();
		txteléfono.setEditable(false);
		txteléfono.setColumns(10);
		txteléfono.setBounds(140, 85, 218, 20);
		contentPane.add(txteléfono);
		
		txtdireccion = new JTextField();
		txtdireccion.setEditable(false);
		txtdireccion.setColumns(10);
		txtdireccion.setBounds(140, 60, 340, 20);
		contentPane.add(txtdireccion);
		
		txtnombre = new JTextField();
		txtnombre.setEditable(false);
		txtnombre.setColumns(10);
		txtnombre.setBounds(140, 35, 218, 20);
		contentPane.add(txtnombre);
		
		txtcedula = new JTextField();
		txtcedula.setEditable(false);
		txtcedula.setColumns(10);
		txtcedula.setBounds(140, 8, 218, 20);
		contentPane.add(txtcedula);
		
		JLabel lblPedido = new JLabel("Pedido");
		lblPedido.setBounds(10, 152, 46, 14);
		contentPane.add(lblPedido);
		
		JButton btnAtender = new JButton("Atender Pedido");
		btnAtender.setBounds(10, 192, 139, 23);
		contentPane.add(btnAtender);
		
		table = new JTable();
		table.setBounds(66, 152, 369, 23);
		contentPane.add(table);
	}
}

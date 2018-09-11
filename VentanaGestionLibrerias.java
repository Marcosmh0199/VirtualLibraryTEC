package Proyecto1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaGestionLibrerias extends JFrame {
	public JPanel contentPane;
	public static JTextField txtnombre;
	public static JTextField txtpais;
	public static JTextField txtubicacion;
	public static JTextField txthorario;
	public static JTextField txttelefono;
	private JTextField txtnombre2;
	private JTextField txtpais2;
	private JTextField txtubicacion2;
	private JTextField txthorario2;
	private JTextField txttelefono2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaGestionLibrerias frame = new VentanaGestionLibrerias();
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
	public VentanaGestionLibrerias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 949, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu ventanatemporal = new Menu();
				VentanaGestionLibrerias.this.dispose();
			}
		});
		btnVolver.setBounds(121, 252, 89, 23);
		contentPane.add(btnVolver);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(121, 36, 269, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtpais = new JTextField();
		txtpais.setColumns(10);
		txtpais.setBounds(121, 77, 269, 20);
		contentPane.add(txtpais);
		
		txtubicacion = new JTextField();
		txtubicacion.setColumns(10);
		txtubicacion.setBounds(121, 114, 269, 20);
		contentPane.add(txtubicacion);
		
		txthorario = new JTextField();
		txthorario.setColumns(10);
		txthorario.setBounds(121, 155, 269, 20);
		contentPane.add(txthorario);
		
		txttelefono = new JTextField();
		txttelefono.setColumns(10);
		txttelefono.setBounds(121, 192, 269, 20);
		contentPane.add(txttelefono);
		
		JButton btnAadirLibreria = new JButton("A\u00F1adir Libreria");
		btnAadirLibreria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GestionLibrerias libreria = new GestionLibrerias();
				libreria.insert(libreria);
				libreria.getdatos();
			}
			
		});
		btnAadirLibreria.setBounds(121, 223, 150, 23);
		contentPane.add(btnAadirLibreria);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(63, 36, 64, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPais = new JLabel("Pais");
		lblPais.setBounds(63, 77, 64, 14);
		contentPane.add(lblPais);
		
		JLabel lblUbicacin = new JLabel("Ubicaci\u00F3n");
		lblUbicacin.setBounds(63, 111, 64, 14);
		contentPane.add(lblUbicacin);
		
		JLabel lblHorario = new JLabel("Horario");
		lblHorario.setBounds(63, 152, 64, 14);
		contentPane.add(lblHorario);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(63, 189, 64, 14);
		contentPane.add(lblTelefono);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBounds(0, 292, 246, -59);
		contentPane.add(panel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 308, 469, 2);
		contentPane.add(separator);
		
		JLabel lblCrearLibrerias = new JLabel("Crear Librerias");
		lblCrearLibrerias.setBounds(223, 11, 167, 14);
		contentPane.add(lblCrearLibrerias);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(469, 16, 0, 82);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(468, 4, 1, 306);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(469, 4, 11, 306);
		contentPane.add(separator_3);
		
		JLabel lblEliminarLibrerias = new JLabel("Eliminar Librerias");
		lblEliminarLibrerias.setBounds(561, 11, 107, 14);
		contentPane.add(lblEliminarLibrerias);
		//listaLibrerias;
		JComboBox eliminarlibreriasbox = new JComboBox();
		eliminarlibreriasbox.setModel(new DefaultComboBoxModel(new String[] {"Prueba1", "Prueba2", "P3", "P4", "Manuel"}));
		eliminarlibreriasbox.setBounds(490, 36, 167, 20);
		contentPane.add(eliminarlibreriasbox);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setBounds(667, 35, 89, 23);
		contentPane.add(btnEliminar);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(469, 308, 469, 2);
		contentPane.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(937, 4, 11, 306);
		contentPane.add(separator_5);
		
		JLabel lblConsultarLibrerias = new JLabel("Consultar Librerias");
		lblConsultarLibrerias.setBounds(422, 321, 167, 14);
		contentPane.add(lblConsultarLibrerias);
		
		JLabel lbltelefono2 = new JLabel("Telefono");
		lbltelefono2.setBounds(177, 518, 64, 14);
		contentPane.add(lbltelefono2);
		
		JLabel lblhorario2 = new JLabel("Horario");
		lblhorario2.setBounds(177, 481, 64, 14);
		contentPane.add(lblhorario2);
		
		JLabel lblubicacion2 = new JLabel("Ubicaci\u00F3n");
		lblubicacion2.setBounds(177, 440, 64, 14);
		contentPane.add(lblubicacion2);
		
		JLabel lblpais2 = new JLabel("Pais");
		lblpais2.setBounds(177, 406, 64, 14);
		contentPane.add(lblpais2);
		
		JLabel lblNombre2 = new JLabel("Nombre");
		lblNombre2.setBounds(177, 365, 64, 14);
		contentPane.add(lblNombre2);
		
		txtnombre2 = new JTextField();
		txtnombre2.setEditable(false);
		txtnombre2.setColumns(10);
		txtnombre2.setBounds(235, 365, 486, 20);
		contentPane.add(txtnombre2);
		
		txtpais2 = new JTextField();
		txtpais2.setEditable(false);
		txtpais2.setColumns(10);
		txtpais2.setBounds(235, 406, 486, 20);
		contentPane.add(txtpais2);
		
		txtubicacion2 = new JTextField();
		txtubicacion2.setEditable(false);
		txtubicacion2.setColumns(10);
		txtubicacion2.setBounds(235, 443, 486, 20);
		contentPane.add(txtubicacion2);
		
		txthorario2 = new JTextField();
		txthorario2.setEditable(false);
		txthorario2.setColumns(10);
		txthorario2.setBounds(235, 484, 486, 20);
		contentPane.add(txthorario2);
		
		txttelefono2 = new JTextField();
		txttelefono2.setEditable(false);
		txttelefono2.setColumns(10);
		txttelefono2.setBounds(235, 521, 486, 20);
		contentPane.add(txttelefono2);
		
		JComboBox consultarlibreriasbox = new JComboBox();
		consultarlibreriasbox.setBounds(742, 362, 181, 20);
		contentPane.add(consultarlibreriasbox);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(742, 402, 89, 23);
		contentPane.add(btnConsultar);
	}
}

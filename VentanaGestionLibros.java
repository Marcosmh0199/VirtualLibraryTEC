package control;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class VentanaGestionLibros extends JFrame {
	GestionLibros libros = new GestionLibros();
	GestionLibrerias libreria = new GestionLibrerias();
	public JPanel contentPane;
	public static  JTextField txtissn;
	public static  JTextField txtnombrelibro;
	public static  JTextField txtcantidad;
	public static  JTextField txtprecio;
	public static  JTextArea txtdescripcion;
	public static JComboBox<String> cmbTema = new JComboBox<String>();
	public static JComboBox<Libreria> LibreriaBox = new JComboBox<Libreria>();
	public static JComboBox<Libro> consultarlibrobox = new JComboBox<Libro>();
	public static JComboBox<Libro> libromodificarbox = new JComboBox<Libro>();
	public static JComboBox<Libreria> cmblibreriam = new JComboBox<Libreria>();
	private JTextField txtcantidad2;
	private JTextField txtissn2;
	private JTextField txtnombre2;
	private JTextField txttema2;
	private JTextField txtvendida2;
	private JTextField txtprecio2;
	private JTextField txtlibreria2;
	public static VentanaGestionLibros frame = new VentanaGestionLibros();
	private JTextField txtpreciom;
	private JTextField txtcantidadm;
	private JTextField txtnombrem;
	private JTextField txtissnm;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
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
	public VentanaGestionLibros() {
		setTitle("Gesti\u00F3n de Libros");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(0, 0, 887, 776);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblissn = new JLabel("Issn");
		lblissn.setBounds(10, 40, 86, 14);
		contentPane.add(lblissn);
		
		JLabel lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(10, 65, 86, 14);
		contentPane.add(lblnombre);
		
		JLabel lblTema = new JLabel("Tema");
		lblTema.setBounds(10, 90, 86, 14);
		contentPane.add(lblTema);
		
		JLabel lbldescripcion = new JLabel("Descripci\u00F3n");
		lbldescripcion.setBounds(10, 115, 86, 14);
		contentPane.add(lbldescripcion);
		
		JLabel lblcantlibros = new JLabel("Cantidad ");
		lblcantlibros.setBounds(10, 211, 86, 14);
		contentPane.add(lblcantlibros);
		
		JLabel lblprecio = new JLabel("Precio");
		lblprecio.setBounds(10, 236, 86, 14);
		contentPane.add(lblprecio);
		
		txtissn = new JTextField();
		txtissn.setBounds(106, 34, 199, 20);
		contentPane.add(txtissn);
		txtissn.setColumns(10);
		
		txtnombrelibro = new JTextField();
		txtnombrelibro.setBounds(106, 59, 199, 20);
		contentPane.add(txtnombrelibro);
		txtnombrelibro.setColumns(10);
		
		txtcantidad = new JTextField();
		txtcantidad.setColumns(10);
		txtcantidad.setBounds(106, 205, 199, 20);
		contentPane.add(txtcantidad);
		
		txtprecio = new JTextField();
		txtprecio.setColumns(10);
		txtprecio.setBounds(106, 230, 199, 20);
		contentPane.add(txtprecio);
		
		txtdescripcion = new JTextArea();
		txtdescripcion.setLineWrap(true);
		txtdescripcion.setBounds(106, 112, 199, 82);
		contentPane.add(txtdescripcion);
		
		JComboBox<Libro> eliminarlibrosbox = new JComboBox<Libro>();
		eliminarlibrosbox.setBounds(378, 37, 199, 20);
		contentPane.add(eliminarlibrosbox);
	
		libromodificarbox.setBounds(488, 634, 182, 22);
		contentPane.add(libromodificarbox);
		
		consultarlibrobox.setBounds(207, 401, 199, 20);
		contentPane.add(consultarlibrobox);
		

		cmblibreriam.setBounds(588, 602, 199, 20);
		contentPane.add(cmblibreriam);
		
		JButton btnAadirLibro = new JButton("A\u00F1adir Libro");
		btnAadirLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int cantidad = Integer.parseInt(VentanaGestionLibros.txtcantidad.getText());
				int precio = Integer.parseInt(VentanaGestionLibros.txtprecio.getText());
				Libro libro2 = new Libro(VentanaGestionLibros.txtissn.getText(),VentanaGestionLibros.txtnombrelibro.getText(), VentanaGestionLibros.cmbTema.getSelectedItem().toString(),VentanaGestionLibros.txtdescripcion.getText(),cantidad,precio,(Libreria)VentanaGestionLibros.LibreriaBox.getSelectedItem());
				libros.append(libro2,1);
				eliminarlibrosbox.addItem(libro2);
				consultarlibrobox.addItem(libro2);
				libromodificarbox.addItem(libro2);
				
				libros.añadirlibros((Libreria)LibreriaBox.getSelectedItem(),libro2);
			}
		});
		btnAadirLibro.setBounds(207, 290, 113, 23);
		contentPane.add(btnAadirLibro);
		
		JLabel lblCrearLibros = new JLabel("Crear Libros");
		lblCrearLibros.setBounds(171, 9, 80, 14);
		contentPane.add(lblCrearLibros);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaGestionLibros.this.hide();
			}
		});
		btnVolver.setBounds(106, 290, 89, 23);
		contentPane.add(btnVolver);
		
		
		cmbTema.setModel(new DefaultComboBoxModel(new String[] {"Ingenier\u00EDa", "Administraci\u00F3n", "Ciencias Naturales", "Artes", "Historia", "Matem\u00E1ticas", "Ficci\u00F3n", "Literatura"}));
		cmbTema.setBounds(106, 87, 199, 20);
		contentPane.add(cmbTema);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 332, 345, 14);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(330, 0, 1, 332);
		contentPane.add(separator_1);
		
		JLabel lblEliminarLibros = new JLabel("Eliminar Libros");
		lblEliminarLibros.setBounds(460, 9, 100, 14);
		contentPane.add(lblEliminarLibros);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				libreria.eliminarlibro((Libreria)LibreriaBox.getSelectedItem(),(Libro)eliminarlibrosbox.getSelectedItem());
				libros.setcurrent((Libro)eliminarlibrosbox.getSelectedItem());
				libros.remove();
				int posicion = consultarlibrobox.getItemCount();
				for(int i=0;i<posicion;i++) {
					if (consultarlibrobox.getItemAt(i).Nombre.equals(eliminarlibrosbox.getSelectedItem().toString())) {
						consultarlibrobox.removeItem(consultarlibrobox.getItemAt(i));
						libromodificarbox.removeItem(libromodificarbox.getItemAt(i));
						break;
					}

				}
				eliminarlibrosbox.removeItem(eliminarlibrosbox.getSelectedItem());
			}
		});
		btnEliminar.setBounds(378, 61, 89, 23);
		contentPane.add(btnEliminar);
		
		JTextArea txtdescripcion2 = new JTextArea();
		txtdescripcion2.setEditable(false);
		txtdescripcion2.setBounds(109, 449, 340, 67);
		contentPane.add(txtdescripcion2);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				libros.setcurrent((Libro) consultarlibrobox.getSelectedItem());
				txtissn2.setText(libros.Getlibro().Issn);
				txtnombre2.setText(libros.Getlibro().Nombre);
				txttema2.setText(libros.Getlibro().Tema);
				txtdescripcion2.setText(libros.Getlibro().Descripcion);
				txtcantidad2.setText(Integer.toString(libros.Getlibro().CantidadDisponible));
				txtvendida2.setText(Integer.toString(libros.Getlibro().CantidadVendida));
				txtprecio2.setText(Integer.toString(libros.Getlibro().Precio));
				txtlibreria2.setText(libros.Getlibro().libreria.toString());
			}
		});
		btnConsultar.setBounds(207, 375, 89, 23);
		contentPane.add(btnConsultar);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(354, 332, 275, 2);
		contentPane.add(separator_2);
		
		JLabel lblConsultarLibro = new JLabel("Consultar Libro");
		lblConsultarLibro.setBounds(151, 350, 100, 14);
		contentPane.add(lblConsultarLibro);
		
		JLabel lblIssn = new JLabel("Issn");
		lblIssn.setBounds(10, 379, 46, 14);
		contentPane.add(lblIssn);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 404, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblTema_1 = new JLabel("Tema");
		lblTema_1.setBounds(10, 429, 46, 14);
		contentPane.add(lblTema_1);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setBounds(10, 454, 86, 14);
		contentPane.add(lblDescripcin);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 537, 86, 14);
		contentPane.add(lblCantidad);
		
		JLabel lblCantidadVendida = new JLabel("Cantidad Vendida");
		lblCantidadVendida.setBounds(10, 562, 107, 14);
		contentPane.add(lblCantidadVendida);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 587, 46, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblLibreria = new JLabel("Libreria");
		lblLibreria.setBounds(10, 612, 66, 14);
		contentPane.add(lblLibreria);
		
		txtcantidad2 = new JTextField();
		txtcantidad2.setEditable(false);
		txtcantidad2.setBounds(109, 534, 86, 20);
		contentPane.add(txtcantidad2);
		txtcantidad2.setColumns(10);
		
		txtissn2 = new JTextField();
		txtissn2.setEditable(false);
		txtissn2.setBounds(109, 376, 86, 20);
		contentPane.add(txtissn2);
		txtissn2.setColumns(10);
		
		txtnombre2 = new JTextField();
		txtnombre2.setEditable(false);
		txtnombre2.setColumns(10);
		txtnombre2.setBounds(109, 401, 86, 20);
		contentPane.add(txtnombre2);
		
		txttema2 = new JTextField();
		txttema2.setEditable(false);
		txttema2.setColumns(10);
		txttema2.setBounds(109, 426, 86, 20);
		contentPane.add(txttema2);
		
		txtvendida2 = new JTextField();
		txtvendida2.setEditable(false);
		txtvendida2.setColumns(10);
		txtvendida2.setBounds(109, 559, 86, 20);
		contentPane.add(txtvendida2);
		
		txtprecio2 = new JTextField();
		txtprecio2.setEditable(false);
		txtprecio2.setColumns(10);
		txtprecio2.setBounds(109, 584, 86, 20);
		contentPane.add(txtprecio2);
		
		txtlibreria2 = new JTextField();
		txtlibreria2.setEditable(false);
		txtlibreria2.setColumns(10);
		txtlibreria2.setBounds(109, 609, 86, 20);
		contentPane.add(txtlibreria2);
		
		JLabel lblLibreria_1 = new JLabel("Libreria");
		lblLibreria_1.setBounds(10, 261, 66, 14);
		contentPane.add(lblLibreria_1);
		
		LibreriaBox.setBounds(106, 261, 199, 20);
		contentPane.add(LibreriaBox);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(628, 0, 1, 332);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(466, 331, 12, 360);
		contentPane.add(separator_4);
		
		JLabel lblModificarLibros = new JLabel("Modificar Libros");
		lblModificarLibros.setBounds(603, 350, 89, 14);
		contentPane.add(lblModificarLibros);
		
		txtpreciom = new JTextField();
		txtpreciom.setColumns(10);
		txtpreciom.setBounds(588, 571, 199, 20);
		contentPane.add(txtpreciom);
		
		txtcantidadm = new JTextField();
		txtcantidadm.setColumns(10);
		txtcantidadm.setBounds(588, 546, 199, 20);
		contentPane.add(txtcantidadm);
		
		JComboBox<String> cmbtemam = new JComboBox<String>();
		cmbtemam.setModel(new DefaultComboBoxModel(new String[] {"Ingenier\u00EDa", "Administraci\u00F3n", "Ciencias Naturales", "Artes", "Historia", "Matem\u00E1ticas", "Ficci\u00F3n", "Literatura"}));
		cmbtemam.setBounds(588, 428, 199, 20);
		contentPane.add(cmbtemam);
		
		JTextArea txtdescripcionm = new JTextArea();
		txtdescripcionm.setLineWrap(true);
		txtdescripcionm.setBounds(588, 453, 199, 82);
		contentPane.add(txtdescripcionm);
		
		JButton btnmodificar = new JButton("Modificar Libro");
		btnmodificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int precio = Integer.parseInt(txtprecio.getText());
				int cantidad = Integer.parseInt(txtcantidadm.getText());
				((Libro)libromodificarbox.getSelectedItem()).setNombre(txtnombrem.getText());
				((Libro)libromodificarbox.getSelectedItem()).setIssn(txtissnm.getText());
				((Libro)libromodificarbox.getSelectedItem()).setTema((String)cmbtemam.getSelectedItem());
				((Libro)libromodificarbox.getSelectedItem()).setDescripcion(txtdescripcionm.getText());
				((Libro)libromodificarbox.getSelectedItem()).setPrecio(precio);
				((Libro)libromodificarbox.getSelectedItem()).setCantidadDisponible(cantidad);
			}
		});
		btnmodificar.setBounds(674, 633, 129, 23);
		contentPane.add(btnmodificar);
		
		JLabel label = new JLabel("Libreria");
		label.setBounds(492, 602, 66, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Precio");
		label_1.setBounds(492, 577, 86, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Cantidad ");
		label_2.setBounds(492, 552, 86, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Descripci\u00F3n");
		label_3.setBounds(492, 456, 86, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Tema");
		label_4.setBounds(492, 431, 86, 14);
		contentPane.add(label_4);
		
		txtnombrem = new JTextField();
		txtnombrem.setColumns(10);
		txtnombrem.setBounds(588, 400, 199, 20);
		contentPane.add(txtnombrem);
		
		JLabel label_5 = new JLabel("Nombre");
		label_5.setBounds(492, 406, 86, 14);
		contentPane.add(label_5);
		
		txtissnm = new JTextField();
		txtissnm.setColumns(10);
		txtissnm.setBounds(588, 375, 199, 20);
		contentPane.add(txtissnm);
		
		JLabel label_6 = new JLabel("Issn");
		label_6.setBounds(492, 381, 86, 14);
		contentPane.add(label_6);
	}
}

package control;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaConsultaLibros extends JFrame {

	private JPanel contentPane;
	public static JTextField txtissn;
	public static JTextField txtnombre;
	public static JTextField txttema;
	public static JTextArea txtdescripcion;
	public static JTextField txtvendida;
	public static JTextField txtdisponible;
	public static JTextField txtprecio;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JLabel lbldescripcionotroidioma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConsultaLibros frame = new VentanaConsultaLibros();
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
	public VentanaConsultaLibros() {
		setTitle("Consulta de Libros");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIssn = new JLabel("Issn");
		lblIssn.setBounds(10, 11, 46, 14);
		contentPane.add(lblIssn);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 36, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblTema = new JLabel("Tema");
		lblTema.setBounds(10, 61, 46, 14);
		contentPane.add(lblTema);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setBounds(10, 86, 83, 14);
		contentPane.add(lblDescripcin);
		
		JLabel lblCantidadVendida = new JLabel("Cantidad Vendida");
		lblCantidadVendida.setBounds(10, 169, 111, 14);
		contentPane.add(lblCantidadVendida);
		
		JLabel lblCantidadDisponible = new JLabel("Cantidad Disponible");
		lblCantidadDisponible.setBounds(10, 194, 125, 14);
		contentPane.add(lblCantidadDisponible);
		
		JLabel lblPrecio = new JLabel("Precio en Dolares");
		lblPrecio.setBounds(10, 219, 125, 14);
		contentPane.add(lblPrecio);
		
		txtissn = new JTextField();
		txtissn.setEditable(false);
		txtissn.setBounds(145, 8, 144, 20);
		contentPane.add(txtissn);
		txtissn.setColumns(10);
		
		txtnombre = new JTextField();
		txtnombre.setEditable(false);
		txtnombre.setColumns(10);
		txtnombre.setBounds(145, 33, 144, 20);
		contentPane.add(txtnombre);
		
		txttema = new JTextField();
		txttema.setEditable(false);
		txttema.setColumns(10);
		txttema.setBounds(145, 58, 144, 20);
		contentPane.add(txttema);
		
		txtvendida = new JTextField();
		txtvendida.setEditable(false);
		txtvendida.setColumns(10);
		txtvendida.setBounds(145, 166, 144, 20);
		contentPane.add(txtvendida);
		
		txtdisponible = new JTextField();
		txtdisponible.setEditable(false);
		txtdisponible.setColumns(10);
		txtdisponible.setBounds(145, 191, 144, 20);
		contentPane.add(txtdisponible);
		
		txtprecio = new JTextField();
		txtprecio.setEditable(false);
		txtprecio.setColumns(10);
		txtprecio.setBounds(145, 216, 144, 20);
		contentPane.add(txtprecio);
		
		txtdescripcion = new JTextArea();
		txtdescripcion.setEditable(false);
		txtdescripcion.setBounds(145, 86, 261, 69);
		contentPane.add(txtdescripcion);
		
		btnAnterior = new JButton("Anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaBusquedaLibros.buscarlibros.setcurrent(VentanaBusquedaLibros.libro);
				if (VentanaBusquedaLibros.buscarlibros.previous()!=false && (VentanaBusquedaLibros.buscarlibros.current!=VentanaBusquedaLibros.buscarlibros.head)) {
					//VentanaBusquedaLibros.buscarlibros.current = VentanaBusquedaLibros.buscarlibros.current.getprevious();
					String textovendida=String.valueOf(VentanaBusquedaLibros.buscarlibros.current.getlibro().CantidadVendida);
					String textodisponible=String.valueOf(VentanaBusquedaLibros.buscarlibros.current.getlibro().CantidadDisponible);
					String textoprecio=String.valueOf(VentanaBusquedaLibros.buscarlibros.current.getlibro().Precio);
					VentanaConsultaLibros.txtissn.setText(VentanaBusquedaLibros.buscarlibros.current.getlibro().Issn);
					VentanaConsultaLibros.txtnombre.setText(VentanaBusquedaLibros.buscarlibros.current.getlibro().Nombre);
					VentanaConsultaLibros.txttema.setText(VentanaBusquedaLibros.buscarlibros.current.getlibro().Tema);
					VentanaConsultaLibros.txtdescripcion.setText(VentanaBusquedaLibros.buscarlibros.current.getlibro().Descripcion);
					VentanaConsultaLibros.txtvendida.setText(textovendida);
					VentanaConsultaLibros.txtdisponible.setText(textodisponible);
					VentanaConsultaLibros.txtprecio.setText(textoprecio);
				}
				else {
					VentanaBusquedaLibros.buscarlibros.current = VentanaBusquedaLibros.buscarlibros.head.getnext();
				}

			}
		});
		btnAnterior.setBounds(101, 247, 89, 23);
		contentPane.add(btnAnterior);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//VentanaBusquedaLibros.buscarlibros.setcurrent(VentanaBusquedaLibros.libro);
				if (VentanaBusquedaLibros.buscarlibros.next()!=false && (VentanaBusquedaLibros.buscarlibros.current!=null)) {
					//VentanaBusquedaLibros.buscarlibros.current = VentanaBusquedaLibros.buscarlibros.current.getnext();
					String textovendida=String.valueOf(VentanaBusquedaLibros.buscarlibros.current.getlibro().CantidadVendida);
					String textodisponible=String.valueOf(VentanaBusquedaLibros.buscarlibros.current.getlibro().CantidadDisponible);
					String textoprecio=String.valueOf(VentanaBusquedaLibros.buscarlibros.current.getlibro().Precio);
					VentanaConsultaLibros.txtissn.setText(VentanaBusquedaLibros.buscarlibros.current.getlibro().Issn);
					VentanaConsultaLibros.txtnombre.setText(VentanaBusquedaLibros.buscarlibros.current.getlibro().Nombre);
					VentanaConsultaLibros.txttema.setText(VentanaBusquedaLibros.buscarlibros.current.getlibro().Tema);
					VentanaConsultaLibros.txtdescripcion.setText(VentanaBusquedaLibros.buscarlibros.current.getlibro().Descripcion);
					VentanaConsultaLibros.txtvendida.setText(textovendida);
					VentanaConsultaLibros.txtdisponible.setText(textodisponible);
					VentanaConsultaLibros.txtprecio.setText(textoprecio);
				}
			}
		});
		btnSiguiente.setBounds(200, 247, 89, 23);
		contentPane.add(btnSiguiente);
		
		lbldescripcionotroidioma = new JLabel("Descripci\u00F3n(en otro idioma)");
		lbldescripcionotroidioma.setHorizontalAlignment(SwingConstants.CENTER);
		lbldescripcionotroidioma.setBounds(0, 306, 154, 20);
		contentPane.add(lbldescripcionotroidioma);
		
		JTextArea txtdescripcionidioma = new JTextArea();
		txtdescripcionidioma.setEditable(false);
		txtdescripcionidioma.setBounds(10, 327, 289, 110);
		contentPane.add(txtdescripcionidioma);
		
		JButton btntraducir = new JButton("New button");
		btntraducir.setBounds(10, 283, 89, 23);
		contentPane.add(btntraducir);
	}
}

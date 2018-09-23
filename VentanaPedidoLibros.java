package control;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JSeparator;
import javax.swing.JList;
import java.awt.Scrollbar;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class VentanaPedidoLibros extends JFrame {

	private JPanel contentPane;
	private JTextField pedcedula;
	private JTextField pednombre;
	private JTextField peddireccion;
	private JTextField pedtelefono;
	private JTextField pedcorreo;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JLabel lblIngreseSuCdula;
	private JTextField cedulapedido;
	private JSeparator separator_3;
	private JButton btnVerPedidos;
	private JTable tablalibros;
	private GestionPedidoLibros pilapedido;
	private Pedido pedido;
	private static int a=0;
	private JButton btnPedirLibro;
	private GestionBusquedaLibros buscar= new GestionBusquedaLibros();
	private JButton btnBuscarLibros;
	static DefaultTableModel model = new DefaultTableModel();
	private JTable tablaconsultar;
	static DefaultTableModel model2 = new DefaultTableModel();
	private JButton btnvolver;

	
	Date fecha = new Date();
	DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	String fecha2=("Fecha: "+formato.format(fecha));
	private JLabel lblLibro;
	private JLabel lblFechaDePedido;
	private JLabel lblAtendido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPedidoLibros  frame = new VentanaPedidoLibros ();
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
	public VentanaPedidoLibros() {
		setTitle("Pedido de libros");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 709, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseCdula = new JLabel("Ingrese C\u00E9dula:");
		lblIngreseCdula.setBounds(10, 21, 115, 14);
		contentPane.add(lblIngreseCdula);
		
		pedcedula = new JTextField();
		pedcedula.setBounds(145, 18, 109, 20);
		contentPane.add(pedcedula);
		pedcedula.setColumns(10);
		
		JLabel lblIngreseNombre = new JLabel("Ingrese nombre:");
		lblIngreseNombre.setBounds(10, 51, 115, 14);
		contentPane.add(lblIngreseNombre);
		
		pednombre = new JTextField();
		pednombre.setBounds(145, 49, 109, 20);
		contentPane.add(pednombre);
		pednombre.setColumns(10);
		
		JLabel lblIngreseSuDireccin = new JLabel("Ingrese su direcci\u00F3n:");
		lblIngreseSuDireccin.setBounds(10, 83, 132, 14);
		contentPane.add(lblIngreseSuDireccin);
		
		peddireccion = new JTextField();
		peddireccion.setBounds(145, 80, 109, 20);
		contentPane.add(peddireccion);
		peddireccion.setColumns(10);
		
		JLabel lblIngreseTelfono = new JLabel("Ingrese tel\u00E9fono:");
		lblIngreseTelfono.setBounds(10, 114, 115, 14);
		contentPane.add(lblIngreseTelfono);
		
		pedtelefono = new JTextField();
		pedtelefono.setBounds(145, 111, 109, 20);
		contentPane.add(pedtelefono);
		pedtelefono.setColumns(10);
		
		JLabel lblIngreseCorreo = new JLabel("Ingrese correo:");
		lblIngreseCorreo.setBounds(10, 145, 115, 14);
		contentPane.add(lblIngreseCorreo);
		
		pedcorreo = new JTextField();
		pedcorreo.setBounds(145, 142, 109, 20);
		contentPane.add(pedcorreo);
		pedcorreo.setColumns(10);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(286, 179, -7, -186);
		contentPane.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 295, 384, 2);
		contentPane.add(separator);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(396, 295, 113, 2);
		contentPane.add(separator_2);
		
		lblIngreseSuCdula = new JLabel("Ingrese su c\u00E9dula:");
		lblIngreseSuCdula.setBounds(316, 51, 109, 14);
		contentPane.add(lblIngreseSuCdula);
		
		cedulapedido = new JTextField();
		cedulapedido.setBounds(431, 48, 86, 20);
		contentPane.add(cedulapedido);
		cedulapedido.setColumns(10);
		
		separator_3 = new JSeparator();
		separator_3.setBounds(503, 295, 140, 2);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(286, 0, 20, 181);
		contentPane.add(separator_4);
		
		JLabel lblVerPedidos = new JLabel("Ver pedidos:");
		lblVerPedidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVerPedidos.setBounds(304, 11, 121, 24);
		contentPane.add(lblVerPedidos);
		
		btnVerPedidos = new JButton("Ver pedidos");
		btnVerPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model2.setRowCount(0);
				pilapedido.settop(cedulapedido.getText());
				pilapedido.getlibrospedido();
				System.out.println(pilapedido);
			}
		});
		btnVerPedidos.setBounds(362, 259, 115, 26);
		contentPane.add(btnVerPedidos);		
		tablalibros = new JTable(model);
		tablalibros.setCellSelectionEnabled(true);
		tablalibros.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablalibros.setBounds(29, 322, 614, 125);
		contentPane.add(tablalibros);
		model.addColumn("Issn");
		model.addColumn("Nombre");
		model.addColumn("Tema");
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(286, 179, 1, 117);
		contentPane.add(separator_5);
		
		JButton btnRegistrar = new JButton("Registrar Usuario");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (a==0) {
					pilapedido = new GestionPedidoLibros();
					a=1;
				}
				pedido = new Pedido(pedcedula.getText(),pednombre.getText(),peddireccion.getText(),pedtelefono.getText(),pedcorreo.getText());
				pilapedido.push(pedido);
			}
		});
		btnRegistrar.setBounds(113, 170, 141, 23);
		contentPane.add(btnRegistrar);
		
		JLabel lblLibrosDisponibles = new JLabel("Libros Disponibles");
		lblLibrosDisponibles.setBounds(242, 298, 109, 14);
		contentPane.add(lblLibrosDisponibles);
		
		btnPedirLibro = new JButton("Pedir Libro");
		btnPedirLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pilapedido.settop(pedcedula.getText());
				int column=tablalibros.getSelectedColumn();
				int row=tablalibros.getSelectedRow();
				if (pilapedido.temp.getpedido().librospedido ==null) {
					pilapedido.temp.getpedido().librospedido = new GestionLibros();
				}
				Libro libro = new Libro();
				libro = (Libro)tablalibros.getValueAt(row, column);
				pilapedido.temp.getpedido().librospedido.append(libro);
				pilapedido.temp.getpedido().fecha=fecha2;
				System.out.println((Libro)tablalibros.getValueAt(row, column));
			}
		});
		btnPedirLibro.setBounds(113, 233, 141, 23);
		contentPane.add(btnPedirLibro);
		
		btnBuscarLibros = new JButton("Buscar Libros");
		btnBuscarLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setRowCount(0);
				buscar.buscartodoslibros();
			}
		});
		btnBuscarLibros.setBounds(113, 204, 141, 23);
		contentPane.add(btnBuscarLibros);
		
		tablaconsultar = new JTable(model2);
		tablaconsultar.setCellSelectionEnabled(true);
		tablaconsultar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablaconsultar.setBounds(315, 96, 368, 152);
		contentPane.add(tablaconsultar);
		model2.addColumn("Libro");
		model2.addColumn("Fecha");
		model2.addColumn("Estado");
		
		tablaconsultar.setCellSelectionEnabled(true);
		tablaconsultar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		btnvolver = new JButton("Volver");
		btnvolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPedidoLibros.this.hide();
			}
		});
		btnvolver.setBounds(113, 261, 141, 23);
		contentPane.add(btnvolver);
		
		lblLibro = new JLabel("Libro");
		lblLibro.setBounds(316, 76, 46, 14);
		contentPane.add(lblLibro);
		
		lblFechaDePedido = new JLabel("Fecha de Pedido");
		lblFechaDePedido.setBounds(441, 79, 126, 14);
		contentPane.add(lblFechaDePedido);
		
		lblAtendido = new JLabel("Atendido");
		lblAtendido.setBounds(570, 76, 59, 14);
		contentPane.add(lblAtendido);
		
		JButton btnBorrarPedido = new JButton("Borrar Pedido");
		btnBorrarPedido.setBounds(478, 261, 115, 23);
		contentPane.add(btnBorrarPedido);
	}
}

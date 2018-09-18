package Control;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
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

public class pedidodelibros extends JFrame {

	private JPanel contentPane;
	private JTextField pedcedula;
	private JTextField pednombre;
	private JTextField peddireccion;
	private JTextField pedtelefono;
	private JTextField textField;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JLabel lblIngreseSuCdula;
	private JTextField textField_1;
	private JSeparator separator_3;
	private JButton btnVerPedidos;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pedidodelibros frame = new pedidodelibros();
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
	public pedidodelibros() {
		setTitle("Pedido de libros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 496);
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
		
		textField = new JTextField();
		textField.setBounds(145, 142, 109, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
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
		
		textField_1 = new JTextField();
		textField_1.setBounds(431, 48, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		separator_3 = new JSeparator();
		separator_3.setBounds(503, 295, 27, 2);
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
		btnVerPedidos.setBounds(362, 259, 115, 26);
		contentPane.add(btnVerPedidos);
		
		table = new JTable();
		table.setBounds(304, 83, 226, 163);
		contentPane.add(table);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(286, 179, 1, 117);
		contentPane.add(separator_5);
		
		JButton btnRegistrar = new JButton("Registrar Usuario");
		btnRegistrar.setBounds(85, 223, 141, 23);
		contentPane.add(btnRegistrar);
		
		table_1 = new JTable();
		table_1.setBounds(12, 323, 518, 122);
		contentPane.add(table_1);
	}
}

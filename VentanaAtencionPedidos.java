package Control;

//Librerias necesarias
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

//Incicia la clase
public class VentanaAtencionPedidos extends JFrame {
	//variables necesarias, se encuentran variables de interfaz
	private JPanel contentPane;
	private JTextField txtcorreo;
	private JTextField txtelefono;
	private JTextField txtdireccion;
	private JTextField txtnombre;
	private JTextField txtcedula;
	public static GestionAtencionPedidos pedidoscompañia;
	private JTextField txtlibros;
	private JTextField txtissnd;
	private JTextField txtnombred;
	private JTextField txttemad;
	private JTextField txtvendidad;
	private JTextField txtdisponibled;
	private JTextField txtrpreciod;
	private JTextField txtnombrelibrover;
	private int cont=0;
	
	//Main, se ejecuta la clase
	public static void main(String[] args) {
		//Creación de la ventana
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

	//Constructor de clase
	public VentanaAtencionPedidos() {
		//Código de la interfaz
		setTitle("Atenci\u00F3n de Pedidos");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 593, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//Etiquetas de palabras que se muestran en interfaz
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
		//Cajas de ingreso de palabras en la interfaz 
		txtcorreo = new JTextField();
		txtcorreo.setEditable(false);
		txtcorreo.setBounds(140, 110, 218, 20);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		txtelefono = new JTextField();
		txtelefono.setEditable(false);
		txtelefono.setColumns(10);
		txtelefono.setBounds(140, 85, 218, 20);
		contentPane.add(txtelefono);
		
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
		//Etiquetas que se ven en interfaz
		JLabel lbllibros = new JLabel("Libros");
		lbllibros.setBounds(10, 138, 46, 14);
		contentPane.add(lbllibros);
		//Botón para atender pedido
		JButton btnAtender = new JButton("Atender Pedido");
		btnAtender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//En la pila se lee la cédula
				VentanaPedidoLibros.pilapedido.settop(pedidoscompañia.first().cedula);
				VentanaPedidoLibros.pilapedido.temp.getpedido().estado = "Si";//Se cambia el estado
				VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.current = VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.head.getnext();
				//se recorre la lista donde se encuantra los pedidos
				while (VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.current != null) {
					VentanaBusquedaLibros.buscarlibros.alterarcantidad(VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.current.libro.Nombre);
					int posicion = VentanaGestionLibros.consultarlibrobox.getItemCount();
					//ciclo que busca en el c
					for(int i=0;i<posicion;i++) {
						Libro libro = (Libro)VentanaGestionLibros.consultarlibrobox.getItemAt(i);
						if(VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.current.libro.Nombre.equals(libro.Nombre)) {
							VentanaGestionLibros.consultarlibrobox.getItemAt(i).CantidadDisponible = VentanaGestionLibros.consultarlibrobox.getItemAt(i).CantidadDisponible - 1;
							VentanaGestionLibros.consultarlibrobox.getItemAt(i).CantidadVendida = VentanaGestionLibros.consultarlibrobox.getItemAt(i).CantidadVendida + 1;
						}
					}
					VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.current = VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.current.getnext();
					cont++;
				}
				//Cuando se realiza el envio del libro, automaticamente se envia un correo para confirmar el envio
				try {
					EnviarCorreo corr = new EnviarCorreo(pedidoscompañia.first().correo,"Pedido Atenndido!","Buenas, le informamos que su pedido ya ha sido atendido, muchas gracias por usar VirtualLibraryTEC");
					JOptionPane.showMessageDialog(null, "Correo enviado!");
				}//Robustez, en caso de que no pueda enviarse el correo
				catch(Exception d){
					JOptionPane.showMessageDialog(null, "Dirección de correo erronea o fallo de internet");
				}//EL ciclo es para eliminar el pedido de la lista
				for (int i=0;i<cont;i++) {
					pedidoscompañia.dequeue();
					}
				//Se busca todos los datos para verficar que aun hay libros pendientes de enviar
				try {
					txtcedula.setText(pedidoscompañia.first().cedula);
					txtnombre.setText(pedidoscompañia.first().nombre);
					txtdireccion.setText(pedidoscompañia.first().direccion);
					txtelefono.setText(pedidoscompañia.first().telefono);
					txtcorreo.setText(pedidoscompañia.first().correo);
					txtlibros.setText(pedidoscompañia.first().librospedido.Getlibros());
				}//Ribustez, cuando no hay libro se envia esta advertencia
		        catch(Exception d){
		        	 JOptionPane.showMessageDialog(null, "El último pedido ya fue atendido");
		        }
				finally
		        {
					txtcedula.setText("");
					txtnombre.setText("");
					txtdireccion.setText("");
					txtelefono.setText("");
					txtcorreo.setText("");
					txtlibros.setText("");
		        }		
			}
		});
		btnAtender.setBounds(10, 163, 139, 23);
		contentPane.add(btnAtender);
		//boton para volver atras
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaAtencionPedidos.this.setVisible(false);
			}
		});
		btnVolver.setBounds(159, 163, 96, 23);
		contentPane.add(btnVolver);
		//Cuandro donde se ingresa palabras
		txtlibros = new JTextField();
		txtlibros.setEditable(false);
		txtlibros.setBounds(140, 135, 218, 20);
		contentPane.add(txtlibros);
		txtlibros.setColumns(10);
		//se añaden los datos del libro a la parte baja de la interfaz
		txtcedula.setText(pedidoscompañia.first().cedula);
		txtnombre.setText(pedidoscompañia.first().nombre);
		txtdireccion.setText(pedidoscompañia.first().direccion);
		txtelefono.setText(pedidoscompañia.first().telefono);
		txtcorreo.setText(pedidoscompañia.first().correo);
		txtlibros.setText(pedidoscompañia.first().librospedido.Getlibros());
		
		txtissnd = new JTextField();
		txtissnd.setEditable(false);
		txtissnd.setColumns(10);
		txtissnd.setBounds(145, 206, 144, 20);
		contentPane.add(txtissnd);
		
		txtnombred = new JTextField();
		txtnombred.setEditable(false);
		txtnombred.setColumns(10);
		txtnombred.setBounds(145, 231, 144, 20);
		contentPane.add(txtnombred);
		
		txttemad = new JTextField();
		txttemad.setEditable(false);
		txttemad.setColumns(10);
		txttemad.setBounds(145, 256, 144, 20);
		contentPane.add(txttemad);
		
		JTextArea txtdescripciond = new JTextArea();
		txtdescripciond.setEditable(false);
		txtdescripciond.setBounds(145, 284, 261, 69);
		contentPane.add(txtdescripciond);
		
		txtvendidad = new JTextField();
		txtvendidad.setEditable(false);
		txtvendidad.setColumns(10);
		txtvendidad.setBounds(145, 364, 144, 20);
		contentPane.add(txtvendidad);
		
		txtdisponibled = new JTextField();
		txtdisponibled.setEditable(false);
		txtdisponibled.setColumns(10);
		txtdisponibled.setBounds(145, 389, 144, 20);
		contentPane.add(txtdisponibled);
		
		txtrpreciod = new JTextField();
		txtrpreciod.setEditable(false);
		txtrpreciod.setColumns(10);
		txtrpreciod.setBounds(145, 414, 144, 20);
		contentPane.add(txtrpreciod);
		//Etiquetas que se muestran en pantalla
		JLabel label = new JLabel("Precio en Dolares");
		label.setBounds(10, 417, 125, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Cantidad Disponible");
		label_1.setBounds(10, 392, 125, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Cantidad Vendida");
		label_2.setBounds(10, 367, 111, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Descripci\u00F3n");
		label_3.setBounds(10, 284, 83, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Tema");
		label_4.setBounds(10, 259, 46, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Nombre");
		label_5.setBounds(10, 234, 46, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Issn");
		label_6.setBounds(10, 209, 46, 14);
		contentPane.add(label_6);
		//boton para ver el detalle del libro que desea comprar
		JButton btnVerDetalleLibro = new JButton("Ver Detalle Libro");
		btnVerDetalleLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.current = VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.head.getnext();
				//Buscar el libro en la lista de libros
				while (VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.current != null) {
					//busca por nombre en la lista donde se encuntra el libro
					if (VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.current.libro.Nombre.equals(txtnombrelibrover.getText())) {
						//Se obtiene cada detalle del libro
						String textovendida=String.valueOf(VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.current.libro.CantidadVendida);
						String textodisponible=String.valueOf(VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.current.libro.CantidadDisponible);
						String textoprecio=String.valueOf(VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.current.libro.Precio);
						txtissnd.setText(VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.current.libro.Issn);
						txtnombred.setText(VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.current.libro.Nombre);
						txttemad.setText(VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.current.libro.Tema);
						txtdescripciond.setText(VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.current.libro.Descripcion);
						txtvendidad.setText(textovendida);
						txtdisponibled.setText(textodisponible);
						txtrpreciod.setText(textoprecio);
					}
					//se mueve el current
					VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.current = VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.current.getnext();
				}
				//se actualiza el while.
				VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.current = VentanaPedidoLibros.pilapedido.temp.getpedido().librospedido.head.getnext();

			}
		});
		//Boton de ver detalle
		btnVerDetalleLibro.setBounds(265, 163, 141, 23);
		contentPane.add(btnVerDetalleLibro);
		//cuadro donde se ingresa tecxto
		txtnombrelibrover = new JTextField();
		txtnombrelibrover.setBounds(416, 164, 151, 23);
		contentPane.add(txtnombrelibrover);
		txtnombrelibrover.setColumns(10);
		//Etiqueta que se muestra en pantalla
		JLabel lblNombreDelLibro = new JLabel("Nombre del Libro");
		lblNombreDelLibro.setBounds(416, 141, 151, 14);
		contentPane.add(lblNombreDelLibro);
	}
}

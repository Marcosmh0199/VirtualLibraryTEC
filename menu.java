package control;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Menu {

	public JFrame frmMenu;

	public static int x=0;
	public static int y=0;
	public VentanaGestionLibrerias ventana1 ;
	public VentanaGestionLibros ventana2 ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frmMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmMenu = new JFrame();
		frmMenu.setTitle("Menu");
		frmMenu.setBounds(100, 100, 500, 340);
		frmMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmMenu.getContentPane().setLayout(null);
		
		JButton btnBotonFuncion1 = new JButton("Gesti\u00F3n de librer\u00EDas");
		btnBotonFuncion1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (x==0) {
					ventana1 = new VentanaGestionLibrerias();
					ventana1.setVisible(true);
					x=1;
				}
				ventana1.setVisible(true);
			}
		});
		btnBotonFuncion1.setBounds(147, 21, 187, 23);
		frmMenu.getContentPane().add(btnBotonFuncion1);
		
		JButton btnBotonFuncion2 = new JButton("Gestion de Libros");
		btnBotonFuncion2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (y==0) {
					ventana2 = new VentanaGestionLibros();
					ventana2.setVisible(true);
					y=1;
				}
				ventana2.setVisible(true);
			}
		});
		btnBotonFuncion2.setBounds(147, 55, 187, 23);
		frmMenu.getContentPane().add(btnBotonFuncion2);
		
		JButton btnBotonFuncion3 = new JButton("Buscar Libros Disponibles");
		btnBotonFuncion3.setBounds(147, 89, 187, 23);
		frmMenu.getContentPane().add(btnBotonFuncion3);
		
		JButton btnBotonFuncion4 = new JButton("Pedidos de Libros");
		btnBotonFuncion4.setBounds(147, 123, 187, 23);
		frmMenu.getContentPane().add(btnBotonFuncion4);
		
		JButton btnBotonFuncion5 = new JButton("Atenci\u00F3n de Pedidos");
		btnBotonFuncion5.setBounds(147, 199, 187, 23);
		frmMenu.getContentPane().add(btnBotonFuncion5);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(196, 233, 89, 23);
		frmMenu.getContentPane().add(btnSalir);
	}
}

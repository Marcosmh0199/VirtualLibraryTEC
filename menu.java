package Proyecto1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Menu {

	public JFrame frmMenu;

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
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.getContentPane().setLayout(null);
		
		JButton btnBotonFuncion1 = new JButton("Gesti\u00F3n de librer\u00EDas");
		btnBotonFuncion1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaGestionLibrerias ventanatemporal = new VentanaGestionLibrerias();
				ventanatemporal.setVisible(true);
			}
		});
		btnBotonFuncion1.setBounds(163, 21, 152, 23);
		frmMenu.getContentPane().add(btnBotonFuncion1);
		
		JButton btnBotonFuncion2 = new JButton("Gestion de Libros");
		btnBotonFuncion2.setBounds(163, 55, 152, 23);
		frmMenu.getContentPane().add(btnBotonFuncion2);
		
		JButton btnBotonFuncion3 = new JButton("Buscar Libros Disponibles");
		btnBotonFuncion3.setBounds(163, 89, 152, 23);
		frmMenu.getContentPane().add(btnBotonFuncion3);
		
		JButton btnBotonFuncion4 = new JButton("Pedidos de Libros");
		btnBotonFuncion4.setBounds(163, 123, 152, 23);
		frmMenu.getContentPane().add(btnBotonFuncion4);
		
		JButton btnBotonFuncion5 = new JButton("Atenci\u00F3n de Pedidos");
		btnBotonFuncion5.setBounds(163, 199, 152, 23);
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

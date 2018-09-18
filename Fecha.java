package Control;

import java.util.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Fecha {
public static void main(String[] args) {
	Date fecha = new Date();
	DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	System.out.println("Fecha: "+formato.format(fecha));
	}
}

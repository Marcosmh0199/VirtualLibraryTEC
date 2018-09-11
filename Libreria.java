package Proyecto1;

public class Libreria extends Libro{
	String Nombre, Pais, Ubicacion, Horario, Telefono;
	Libro libro;
	
	public Libreria(String pNombre,String pPais, String pUbicacion, String pHorario, String pTelefono) {
		Nombre = pNombre;
		Pais = pPais;
		Ubicacion = pUbicacion;
		Horario = pHorario;
		Telefono = pTelefono;
		
	}
	public Libreria() {
		Nombre = "pNombre";
		Pais = "pPais";
		Ubicacion = "pUbicacion";
		Horario = "pHorario";
		Telefono = "pTelefono";
	}
	public void setNombreLibreria(String pNombre) {
		Nombre = pNombre;
	}
	public void setPais(String pPais) {
		Pais = pPais;
	}
	public void setUbicacion(String pUbicacion) {
		Ubicacion = pUbicacion;
	}
	public void setHorario(String pHorario) {
		Horario = pHorario;
	}
	public void setTelefono(String pTelefono) {
		Telefono = pTelefono;
	}
	public void setlibro(Libro plibro) {
		libro = plibro;
	}
	public String getNombreLibreria() {
		return Nombre;
	}
	public String getPais() {
		return Pais;
	}
	public String getUbicacion() {
		return Ubicacion;
	}
	public String getHorario() {
		return Horario;
	}
	public String getTelefono() {
		return Telefono;
	}
	public Libro getlibro() {
		return libro;
	}
}

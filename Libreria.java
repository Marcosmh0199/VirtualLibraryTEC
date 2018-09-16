package control;

public class Libreria{
	String Nombre, Pais, Ubicacion, Horario, Telefono;
	GestionLibros libros;
	
	public Libreria(String pNombre,String pPais, String pUbicacion, String pHorario, String pTelefono) {
		Nombre = pNombre;
		Pais = pPais;
		Ubicacion = pUbicacion;
		Horario = pHorario;
		Telefono = pTelefono;
		libros = null;
	}
	public Libreria() {
	}
	public Libreria(GestionLibros plibros) {
		libros = plibros;
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
	public void setlibro(GestionLibros plibros) {
		libros = plibros;
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
	public GestionLibros getlibros() {
		return libros;
	}
	@Override
	public String toString() {
		return Nombre;
	}
}

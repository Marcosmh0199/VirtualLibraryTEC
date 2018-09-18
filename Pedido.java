package control;

public class Pedido {
	String cedula,nombre,direccion,telefono,correo;
	Libro libro;
	Pedido(String pcedula,String pnombre,String pdireccion,String ptelefono,String pcorreo,Libro plibro){
		this.cedula = pcedula;
		this.nombre = pnombre;
		this.direccion = pdireccion;
		this.telefono = ptelefono;
		this.correo = pcorreo;
		this.libro = plibro;
	}
	public void setcedula(String pcedula) {
		this.cedula=pcedula;
	}
	public void setnombre(String pnombre) {
		this.nombre=pnombre;
	}
	public void setdireccion(String pdireccion) {
		this.direccion=pdireccion;
	}
	public void settelefono(String ptelefono) {
		this.telefono=ptelefono;
	}
	public void setcorreo(String pcorreo) {
		this.correo=pcorreo;
	}
	public void setlibro(Libro plibro) {
		this.libro = plibro;
	}
	public String getCedula() {
		return cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public Libro getLibro() {
		return libro;
	}
	
		
}

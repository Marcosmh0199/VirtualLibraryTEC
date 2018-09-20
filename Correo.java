package Control;

public class Correo {
	String usuario,contraseña,destino,asunto,cuerpomensaje;
	
	public Correo(String usuario,String contraseña,String destino,String asunto,String cuerpomensaje) {
		this.usuario=usuario;
		this.contraseña=contraseña;
		this.destino=destino;
		this.asunto=asunto;
		this.cuerpomensaje=cuerpomensaje;
		}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getCuerpomensaje() {
		return cuerpomensaje;
	}

	public void setCuerpomensaje(String cuerpomensaje) {
		this.cuerpomensaje = cuerpomensaje;
	}
	
}

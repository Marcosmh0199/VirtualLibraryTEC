package control;

public class GestionLibrerias extends Libreria {
	
	public static class Nodo{
		Nodo next;
		Libreria libreria;
		
		public Nodo() {
			this.libreria= null;
			this.next = null;
		}
		public Nodo(Libreria libreria) {
			this.libreria = new Libreria(VentanaGestionLibrerias.txtnombreLibreria.getText(),VentanaGestionLibrerias.txtpais.getText(), VentanaGestionLibrerias.txtubicacion.getText(), VentanaGestionLibrerias.txthorario.getText(), VentanaGestionLibrerias.txttelefono.getText());
			this.next = null;
    	}
		public Nodo(GestionLibros plibro) {
			this.libreria.libros=plibro;
		}
		public Nodo(Libreria libreria, Nodo next) {
			this.libreria = new Libreria(VentanaGestionLibrerias.txtnombreLibreria.getText(),VentanaGestionLibrerias.txtpais.getText(), VentanaGestionLibrerias.txtubicacion.getText(), VentanaGestionLibrerias.txthorario.getText(), VentanaGestionLibrerias.txttelefono.getText());
			this.next = next;
		}
		public Libreria getlibreria() {
			return this.libreria;
    	}
		public void setnext(Nodo next) {
			this.next = next;
    	}
		public Nodo getnext() {
			return this.next;
    	}
	}
	Nodo head;
    Nodo current;
    Nodo tail;
    int posicion;
    int tamaño;
    
    public GestionLibrerias() {
    	this.head = new Nodo();
    	this.current = this.head;
    	this.tail = this.head;
    	this.tamaño = 0;
    	this.posicion = -1;
    }
    public void append(Libreria libreria) {
    	Nodo NuevoNodo = new Nodo(libreria);
        this.tail.setnext(NuevoNodo);
        this.tail = NuevoNodo;
        this.tamaño++;
    }
    public void setcurrent(Libreria libreria) {
    	this.current = this.head.getnext();
    	while (!this.current.getlibreria().Nombre.equals(libreria.Nombre)) {
    		this.current = this.current.getnext();
    	}
    }
    public void remove() {
    	 //verificar que la lista no está vacía
        if (this.tamaño == 0){
            System.out.println("Lista vacía, no se puede remover ningún elemento");
            return;
        }
        //en temp se va a almacenar el nodo ANTERIOR al que se quiere borrar
        Nodo temp = this.head;
        while (temp.getnext() != this.current) {
            temp = temp.getnext();
        }
        //borrar la referencia al nodo actual
        temp.setnext(this.current.getnext());
        //necesario si se esta borrando el último nodo
        if (this.current == this.tail) {
            this.current = this.tail = temp;
            this.posicion--;
        }
        else

            this.current = this.current.getnext();
        //disminuir el tamaño
        this.tamaño--;
    }
    
    public void clear() {
        this.head = this.tail = this.current = new Nodo();
        this.posicion = -1;
        this.tamaño = 0;
    }
    public Libreria Getlibreria() {
    	return this.current.getlibreria();
    }
    public GestionLibros getLibros(Libreria libreria) {
    	return libreria.libros;
    }
    public void eliminarlibro(Libreria plibreria,Libro libro) {
    	plibreria.libros.setcurrent(libro);
    	plibreria.libros.remove();
    }
}

package control;

public class GestionLibros extends Libro {
	public class Nodo{
		Nodo next;
		Libro libro;
		
		public Nodo() {
			this.libro= null;
			this.next = null;
		}
		private Nodo(Libro libro, int a) {
			if (a==0) {
				int cantidad = Integer.parseInt(VentanaGestionLibros.txtcantidad.getText());
				int precio = Integer.parseInt(VentanaGestionLibros.txtprecio.getText());
				this.libro = new Libro(VentanaGestionLibros.txtissn.getText(),VentanaGestionLibros.txtnombrelibro.getText(), VentanaGestionLibros.cmbTema.getSelectedItem().toString(),VentanaGestionLibros.txtdescripcion.getText(),cantidad,precio,(Libreria)VentanaGestionLibros.LibreriaBox.getSelectedItem());
			}
			else {
				this.libro = libro;
			}
			this.next = null;
    	}
		private Nodo(Libro libro, Nodo next) {
			int cantidad = Integer.parseInt(VentanaGestionLibros.txtcantidad.getText());
			int precio = Integer.parseInt(VentanaGestionLibros.txtprecio.getText());
			this.libro = new Libro(VentanaGestionLibros.txtissn.getText(),VentanaGestionLibros.txtnombrelibro.getText(),VentanaGestionLibros.cmbTema.getSelectedItem().toString(), VentanaGestionLibros.txtdescripcion.getText(),cantidad,precio,(Libreria)VentanaGestionLibros.LibreriaBox.getSelectedItem());
			this.next = next;
		}
		public Libro getlibro() {
			return this.libro;
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
    
    public GestionLibros() {
    	this.head = new Nodo();
    	this.current = this.head;
    	this.tail = this.head;
    	this.tamaño = 0;
    	this.posicion = -1;
    }
    public void setcurrent(Libro libro) {
    	this.current = this.head.getnext();
    	while (!this.current.getlibro().Issn.equals(libro.Issn)) {
    		this.current = this.current.getnext();
    	}
    }
    public void append(Libro libro,int a) {
    	if (a==0) {
    		Nodo NuevoNodo = new Nodo(libro,0);
            this.tail.setnext(NuevoNodo);
            this.tail = NuevoNodo;
    	}
    	else {
    		Nodo NuevoNodo = new Nodo(libro,1);
            this.tail.setnext(NuevoNodo);
            this.tail = NuevoNodo;
    	}	

        this.tamaño++;
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
           //necesario si se está borrando un nodo diferente al último
           this.current = this.current.getnext();

       //disminuir el tamaño
       this.tamaño--;
   }
    public void clear() {
        this.head = this.tail = this.current = new Nodo();
        this.posicion = -1;
        this.tamaño = 0;
    }
    public void añadirlibros(Libreria plibreria,Libro libro) {
    	if (plibreria.libros == null) {
    		plibreria.libros = new GestionLibros();
    	}
    	plibreria.libros.append(libro,0);
    }
    public Libro Getlibro() {
    	return this.current.getlibro();
    }
    public String Getlibros() {
    	this.current=this.head.getnext();
		String libros="";
    	while (this.current!=null) {
    		libros=this.current.getlibro().Nombre+","+libros;
    		this.current=this.current.getnext();
    	}
    	return libros;
    }
    @Override
    public String toString() {
    	this.current=this.head.getnext();
		String libros="";
    	while (this.current!=null) {
    		libros=this.current.getlibro().Nombre+","+libros;
    		this.current=this.current.getnext();
    	}
    	return libros;
    }
}

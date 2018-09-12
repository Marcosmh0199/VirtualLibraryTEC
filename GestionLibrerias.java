package Proyecto1;

public class GestionLibrerias extends Libreria {
	
	public static class Nodo extends Libreria{
		Nodo next;
		Libreria libreria;
		
		public Nodo() {
			this.libreria= null;
			this.next = null;
		}
		public Nodo(Libreria libreria) {
			this.libreria = new Libreria(VentanaGestionLibrerias.txtnombre.getText(),VentanaGestionLibrerias.txtpais.getText(), VentanaGestionLibrerias.txtubicacion.getText(), VentanaGestionLibrerias.txthorario.getText(), VentanaGestionLibrerias.txttelefono.getText());
			this.next = null;
    	}

		public Nodo(Libreria libreria, Nodo next) {
			this.libreria = new Libreria(VentanaGestionLibrerias.txtnombre.getText(),VentanaGestionLibrerias.txtpais.getText(), VentanaGestionLibrerias.txtubicacion.getText(), VentanaGestionLibrerias.txthorario.getText(), VentanaGestionLibrerias.txttelefono.getText());
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
    public void insert(Libreria libreria) {
		Nodo NuevoNodo = new Nodo(libreria);
		this.current.setnext(NuevoNodo);
		this.current=NuevoNodo;
		if (this.current == this.tail) {
			this.tail=tail.getnext();
		}
		this.tamaño++;
	}
    public void remove(String nombre) {
        if (this.tamaño == 0){
            System.out.println("Lista vacía, no se puede remover ningún elemento");
            return;
        } 
        this.current=this.head.getnext();
        Nodo temporal = this.head;
        while (this.current!= null) {
            if (this.current.getlibreria().Nombre.equals(nombre)){
            	System.out.println("Sirvió");
            	break;
            }
            this.current=this.current.getnext();
            temporal=temporal.getnext();
        }
        temporal.setnext(temporal.getnext());
        if (this.current == this.tail) {
            this.current = this.tail=temporal;
            this.posicion--;
        }
        else
            this.current =this.current.getnext();
        this.tamaño--;
    }
    public void clear() {
        this.head = this.tail = this.current = new Nodo();
        this.posicion = -1;
        this.tamaño = 0;
    }
    public Libreria getlibreria() {
    	return this.current.getlibreria();
    }
    public void getdatos() {
    	this.current = this.head.getnext();
    	while (this.current !=null) {
        	System.out.println("Nombre:"+this.getlibreria().Nombre);
        	System.out.println("País:"+this.getlibreria().Pais);
        	System.out.println("Ubicacion:"+this.getlibreria().Ubicacion);
        	System.out.println("Horario:"+this.getlibreria().Horario);
        	System.out.println("Telefono:"+this.getlibreria().Telefono);
    		this.current=this.current.getnext();
    	}
    	this.current=this.head.getnext();
    }
    
    public static void main(String Args[]) {
    		
    }
}

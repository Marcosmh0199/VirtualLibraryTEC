package control;

public class GestionPedidoLibros{
	public class Nodo {
		
		private Pedido pedido;
		private Nodo next;

		public Nodo() {
		    this.pedido = null;
		    this.next = null;
		}

		public Nodo(Pedido pedido) {
			this.pedido = pedido;
		    this.next = null;
		}

		public Nodo(Pedido pedido, Nodo next) {
		    this.pedido = pedido;
		    this.next = next;
		}
	    public Pedido getpedido() {
		    return this.pedido;
		}

		public void setpedido(Pedido pedido) {
		    this.pedido = pedido;
		}

		public Nodo getNext() {
		    return this.next;
		}

		public void setNext(Nodo next) {
			this.next = next;
		}    	
	}
	private Nodo top;
	private int size;
	public Nodo temp;
	
	public GestionPedidoLibros() {
		this.top = null;
		this.size = 0;
	}

	public void push(Pedido pedido) {
		this.top = new Nodo(pedido, this.top);
		this.size++;
	}

	public Pedido pop(){
		if (this.top == null) {
			System.out.println("Stack is empty");
			return null;
		}
		Pedido temp = this.top.getpedido();
		this.top = this.top.getNext();
		this.size--;
		return temp;
	}
	public Pedido top(){
		if (this.top == null) {
			System.out.println("Stack is empty");
			return null;
		}
		return this.top.getpedido();
	}

	public int size(){
		return this.size;
	}

	public void clear(){
		this.top = null;
		this.size = 0;
	}
	public void settop(String cedula) {
		temp = this.top;	
		while(!temp.getpedido().cedula.equals(cedula)) {
			temp = temp.getNext();
		}
	}
	public void getlibrospedido() {
		temp.getpedido().librospedido.current = temp.getpedido().librospedido.head.getnext();
		while(temp.getpedido().librospedido.current!=null) {
			VentanaPedidoLibros.model2.addRow(new Object[] { temp.getpedido().librospedido.current.libro, temp.getpedido().fecha,temp.getpedido().estado });
			temp.getpedido().librospedido.current = temp.getpedido().librospedido.current.getnext();
		}
	}
	public void eliminarlibropedido(Libro libro) {
		int i=0;
		temp.getpedido().librospedido.current = temp.getpedido().librospedido.head.getnext();
		while(temp.getpedido().librospedido.current!=null) {
			if (temp.getpedido().librospedido.current.libro == libro) {
				temp.getpedido().librospedido.remove();
				VentanaPedidoLibros.model2.removeRow(i);
			}
			i++;
			temp.getpedido().librospedido.current=temp.getpedido().librospedido.current.getnext();
		}
	}
	public String toString(){
		String result = "**LStack**\n";
		Nodo temp = top;
		while(temp != null){
			result+= temp.getpedido().librospedido + "\n";
			temp = temp.getNext();
		}
		return result;
	}
}

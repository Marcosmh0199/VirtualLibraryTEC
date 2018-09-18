package Control;


public class GestionPedidoLibros{
	private class Nodo {

		private Pedido pedido;
	    private Nodo next;

	    //Constructores
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

	    //metodos

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

	    public String toString(){
	        String result = "**LStack**\n";
	        Nodo temp = top;
	        while(temp != null){
	            result+= temp.getpedido() + "\n";
	            temp = temp.getNext();
	        }
	        return result;
	    }


	}


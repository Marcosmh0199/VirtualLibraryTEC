package control;

public class GestionAtencionPedidos {
	 private class Nodo {

		 private Pedido pedido;
		 Nodo next;
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
	 public Nodo front;
	 public Nodo rear;
	 public int size;
	 
	 public GestionAtencionPedidos(){
		 this.front = new Nodo();
		 this.rear = this.front;
		 this.size = 0;
	 }
	 public void enqueue(Pedido pedido){
		 this.rear.setNext(new Nodo(pedido, null));
		 this.rear = rear.getNext();
		 this.size++;
	 }

	 public boolean dequeue(){
		 if(this.size == 0){
			 return false;
		 }
		 Pedido temp = this.front.getNext().getpedido();
		 Nodo nTemp = this.front.getNext();
		 this.front.setNext(nTemp.getNext());
		 if (this.rear == nTemp){
			 this.rear = this.front;
		 }
		 this.size--;
		 return true;
	 }

	 public Pedido first(){
		 if(this.size == 0){
			 return null;
		 }
		 return this.front.getNext().getpedido();
	 }

	 public int size(){
		 return this.size;
	 }

	 public void clear(){
		 this.front = new Nodo();
		 this.rear = this.front;
		 this.size = 0;
	 }
}
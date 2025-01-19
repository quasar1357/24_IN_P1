public class Node<E> {

	// Das zu speichernde Element im Knoten
	private E element;
	// Referenz auf den Nachfolgerknoten
	private Node<E> next;

	/**
	 * Konstruiert einen neuen Knoten mit Element e.
	 */
	public Node(E e) {
		this.element = e;
	}

	/**
	 * Getter für den Nachfolgerknoten.
	 */
	public Node<E> getNext() {
		return this.next;
	}

	/**
	 * Setter für den Nachfolgerknoten.
	 */
	public void setNext(Node<E> node) {
		this.next = node;
	}

	/**
	 * Liefert eine Zeichenkettenrepräsentation dieses Knotens.
	 */
	public String toString() {
		return element.toString();
	}
}

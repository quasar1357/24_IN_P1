package ch11;

import org.w3c.dom.Node;

public class OwnLinkedList<E> {

	// Startknoten der Liste
	private Node<E> startNode;

	/**
	 * Konstruiert eine leere Liste (Startknoten = null).
	 */
	public OwnLinkedList(){
		this.startNode = null;
	}

	/**
	 * Fügt das übergebene Element an das Ende dieser Liste an.
	 */
	public void add(E element) {
		Node<E> node = new Node<E>(element);
		if (this.startNode == null)
			this.startNode = node;
		else {
			Node<E> current = this.startNode;
			while (current.getNext() != null)
				current = current.getNext();
			current.setNext(node);
		}
	}

// OWN METHODS /////////////////////////////////////////////////////////////////

	public Node<E> remove(int index) {
		if (infex < 0 || index >= this.size())
			return null;
		if (index == 0) {
			Node<E> removed = this.startNode;
			this.startNode = this.startNode.getNext();
			return removed;
		}
		Node<E> current = this.startNode;
		for (int i = 0; i < index - 1; i++) // bis zum Vorgänger des zu löschenden Knotens
			current = current.getNext();
		Node<E> prev = current;
		removed = current.getNext();
		next = removed.getNext();
		prev.setNext(next);
		remove.setNext(null); // optional, aber sauberer...
		return removed;		
	}

	public int size() { // NOTE: hier size nicht immer aktualisiert, sondern über Methode berechnet
		int size = 0;
		Node<E> current = this.startNode;
		while (current != null) {
			size++;
			current = current.getNext();
		}
		return size;
	}

/////////////////////////////////////////////////////////////////////////////

	/**
	 * Liefert eine Zeichenkettenrepräsentation dieser Liste.
	 */
	public String toString() {
		String result = "";
		Node<E> current = this.startNode;
		while (current != null) {
			result += current + "\t";
			current = current.getNext();
		}
		return result;
	}
}

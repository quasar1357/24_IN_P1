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

	/**
	 * EIGENE METHODEN
	 */
	
	/**
	 * Gibt die Grösse der Liste zurück.
	 */
	public int size() {
		if (this.startNode == null)
			return 0;
		int size = 1;
		Node<E> current = this.startNode;
		while (current.getNext() != null){
			current = current.getNext();
			size++;
		}
		return size;
	}

	public Node<E> getStartNode() { // OPTIONAL
		return startNode;
	}


}

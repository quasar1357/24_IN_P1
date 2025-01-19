package ch11;

public class OwnArrayList {

	// Startgrösse und Anzahl  tatsächlich gespeicherter Elemente
	private int capacity = 10;
	private int size;
	// Listenelemente werden intern in einem Array verwaltet
	private Object[] listElements;

	/**
	 * Konstruiert eine leere Liste mit einer Anfangskapazität von zehn.
	 */
	public OwnArrayList() {
		this.size = 0;
		this.listElements = new Object[capacity];
	}
	
	/**
	 * Fügt das übergebene Element an das Ende dieser Liste an.
	 */
	public boolean add(Object object) {
		if (this.size == this.capacity)
			this.increaseSize();
		this.listElements[this.size] = object;
		this.size++;
		return true;
	}

// OWN METHODS /////////////////////////////////////////////////////////////////

	/**
	 * Löscht das Element an der übergebenen Position und gibt es zurück.
	 */
	public Object remove(int index) {
		if (index < 0 || index >= this.size)
			return null;
		Object removed = this.listElements[index];
		for (int i = index; i < this.size - 1; i++)
			this.listElements[i] = this.listElements[i + 1];
		this.listElements[this.size] = null; // Achtung: soll es size sein oder size-1?
		this.size--;
		return removed;
	}

///////////////////////////////////////////////////////////////////////////////
	
	/**
	 * Verdoppelt die Grösse des zu Grunde liegenden Arrays.
	 */
	private void increaseSize() {
		this.capacity *= 2;
		Object[] temp = new Object[this.capacity];
		for (int i = 0; i < this.listElements.length; i++)
			temp[i] = this.listElements[i];
		this.listElements = temp;
	}
	
	/**
	 * Liefert eine Zeichenkettenrepräsentation dieser Liste.
	 */
	public String toString() {
		String result = "";
		for (int i = 0; i < this.size; i++)
			result += this.listElements[i] + "\t";
		return result;
	}
	
}
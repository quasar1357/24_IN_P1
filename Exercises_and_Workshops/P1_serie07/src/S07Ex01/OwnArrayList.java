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

	/**
	 * EIGENE METHODEN
	 */
	
	/**
	 * Fügt das übergebene Element an der übergebenen Position in dieser Liste ein.
	 */
	public boolean set(int i, Object o) {
		if (i < 0 || this.size <= i)
			return false;
		this.listElements[i] = o;
		return true;
	}
}
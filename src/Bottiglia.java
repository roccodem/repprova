
public class Bottiglia<T> {
	private T contenuto;

	/**
	 * 
	 * @param t
	 */
	public Bottiglia(T t) {
		this.contenuto = t;
	}

	public T getContenuto() {
		return contenuto;
	}

}

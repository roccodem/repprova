
public class Bottiglia<T> {
	private T contenuto;

	/**
	 * 
	 * @param t
	 * @category my category
	 */
	public Bottiglia(T t) {
		this.contenuto = t;
	}

	public T getContenuto() {
		return contenuto;
	}

}


public class Card {

	private String name;
	private int value;
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println(name + " " + value);
	}
}

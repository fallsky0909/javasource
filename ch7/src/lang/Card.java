package lang;

public class Card {
	String kind;
	int number;
	
	public Card() {
		this("SPADE", 1);
	}
	
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Kind : "+kind+", number : "+number;
	
	
	}
	
	
	
}

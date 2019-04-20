public class Card {
	
	private char cardsym;
	private int cardno;
	public Card(char cardsym, int cardno) {
		super();
		this.cardsym = cardsym;
		this.cardno = cardno;
	}
	public char getCardsym() {
		return cardsym;
	}
	public void setCardsym(char cardsym) {
		this.cardsym = cardsym;
	}
	public int getCardno() {
		return cardno;
	}
	public void setCardno(int cardno) {
		this.cardno = cardno;
	}

}

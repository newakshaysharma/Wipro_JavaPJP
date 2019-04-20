public class Card {

	private char cardsym;
	private int cardNo;
	public Card(char cardsym, int cardNo) {
		this.cardsym = cardsym;
		this.cardNo = cardNo;
	}
	public char getCardsym() {
		return cardsym;
	}
	public void setCardn(char cardsym) {
		this.cardsym = cardsym;
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	
}

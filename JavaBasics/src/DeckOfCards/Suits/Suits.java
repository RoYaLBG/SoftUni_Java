package DeckOfCards.Suits;

import DeckOfCards.Cards.*;

abstract public class Suits {
	
	protected String _suit;
	protected String _color;
	protected String _card;
	
	protected Cards _cards;
	
	public Suits(String suit, String color, String card, Cards cards) {
		this._suit = suit;
		this._color = color;
		this._card = card;
		this._cards = cards;
	}
	
	public String getSuit() {
		return this._suit;
	}
	
	public String getColor() {
		return this._color;
	}
	
	public String getCard() {
		return this._card;
	}
	
	public String getIcon() {
		return this._card + this._suit;
	}
	
	public void setCardState() {
		this._cards.setSuits(this);
	}
}

package DeckOfCards.Cards;

import DeckOfCards.Suits.*;

public class CardsFactory {

	public static void createDeck(String suit, String color, String card, Cards cards) {
		Suits cardSuit = null;
		
		switch (suit) {
		
			case "♥":
				cardSuit = new Hearts(suit, color, card, cards);
				break;
			case "♦":	
				cardSuit = new Diamonds(suit, color, card, cards);
				break;
			case "♠":	
				cardSuit = new Spades(suit, color, card, cards);
				break;
			case "♣":	
				cardSuit = new Clubs(suit, color, card, cards);
				break;

		}
		
		cardSuit.setCardState();
	}
	
	
}

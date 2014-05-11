package DeckOfCards.Cards;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import org.fusesource.jansi.AnsiConsole;

import DeckOfCards.Library.Ansi;
import DeckOfCards.Suits.*;

public class Cards {

	private List<Suits> _suits = new ArrayList<Suits>();
	private Hashtable<String, String> _colorMap = new Hashtable<String, String>();
	
	public Cards() {
		this.initRedColor();
		this.initBlackColor();
	}
	
	public void setSuits(Suits suits) {
		this._suits.add(suits);
	}
	
	public void printCards() {
		String color = null;
		for (Suits s: this.getDeck()) {
			color = this.getAnsiColor(s.getColor());
			AnsiConsole.out.println(color + s.getIcon());
		}
	}
	
	public List<Suits> getDeck() {
		return this._suits;
	}
	
	private void initRedColor() {
		this._colorMap.put("red", Ansi.COLOR_RED);
	}
	
	private void initBlackColor() {
		this._colorMap.put("black", Ansi.COLOR_BLACK);
	}
	
	public String getAnsiColor(String color) {
		return this._colorMap.get(color);
	}
	
}

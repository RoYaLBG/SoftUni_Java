package DeckOfCards.Main;

import java.io.IOException;

import org.fusesource.jansi.AnsiConsole;

import com.itextpdf.text.DocumentException;

import DeckOfCards.Cards.*;
import DeckOfCards.Export.DeckToPdf;
import DeckOfCards.Library.Fonts;


public class Starter {
	
	private static final String OUTPUT_FILE = "DeckOfCards.pdf";

	private static Cards cards;
	
	public static void main(String[] args) {
		cards = new Cards();
		
		createDeck();
		
		printDeck();
		
		generatePdf();
	}
	
	
	private static void createDeck() {
		for (int i = 0; i < DeckStruct.cardFaces.length; i++) {
			for (int j = 0; j < DeckStruct.cardSuits.length; j++) {
				
				CardsFactory.createDeck(
						DeckStruct.cardSuits[j],
						DeckStruct.cardColors[j],
						DeckStruct.cardFaces[i],
						cards
					);
				
			}
		}
	}
	
	private static void printDeck() {
		AnsiConsole.systemInstall();
		cards.printCards();
	}
	
	private static void generatePdf() {
		DeckToPdf deckPdf = null;
		try {
			 deckPdf = new DeckToPdf(Fonts.DIR+Fonts.Times, OUTPUT_FILE);
			 deckPdf.setCards(cards);
			 deckPdf.export();
		} catch (DocumentException | IOException e) {
			e.printStackTrace();
		}
	}
	

	
}

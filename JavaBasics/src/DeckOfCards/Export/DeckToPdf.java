package DeckOfCards.Export;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

import DeckOfCards.Cards.Cards;
import DeckOfCards.Export.Pdf.*;
import DeckOfCards.Suits.Suits;

public class DeckToPdf extends PDF_Export {
	
	private Cards _cards;
	private static final int COLUMNS = 4;

	public DeckToPdf(String font, String outputFile) throws FileNotFoundException, DocumentException {
		super(font, outputFile);
	}
	
	public void setCards(Cards cards) {
		this._cards = cards;
	}
	
	public Cards getCards() {
		return this._cards;
	}
	
	public void export() throws DocumentException, IOException {
		BaseFont bf;
		bf = BaseFont.createFont(this.getFont(), BaseFont.IDENTITY_H, true);
		PdfPTable table = new PdfPTable(COLUMNS);
		for (Suits s: this.getCards().getDeck()) {
			table.addCell(new PdfPCell((new Paragraph(s.getIcon(), new Font(bf, 1, 1, this.getRelevantColor(s.getColor()))))));
		}
		table.completeRow();
		this.getPdf().add(table);
		this.getPdf().close();
	}
	
	private BaseColor getRelevantColor(String color) throws DocumentException {
		switch (color) {
			case "red":
				return BaseColor.RED;
			case "black":
				return BaseColor.BLACK;
		}
		throw new DocumentException("Invalid color supplied");
	}
}

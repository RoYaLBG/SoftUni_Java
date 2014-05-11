package DeckOfCards.Export.Pdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;

abstract public class PDF_Export {
	
	protected String _font;

	protected Document _pdf;
	protected String _outputFile;
	
	public PDF_Export(String font, String outputFile) throws FileNotFoundException, DocumentException {
		this._font = font;
		this._outputFile = outputFile;
		this.generatePdf();
		this.createPdfWriter();
	}
	
	public void generatePdf() {
		this._pdf = new Document(PageSize.A4, 50, 50, 50, 50);
	}
	
	protected void createPdfWriter() throws FileNotFoundException, DocumentException {
		try {
			PdfWriter.getInstance(this._pdf , new FileOutputStream(this._outputFile));
			this._pdf.open();
		} catch(DocumentException de) {
			System.err.println(de.getMessage());
		}
	}
	
	protected Document getPdf() {
		return this._pdf;
	}
	
	protected String getFont() {
		return this._font;
	}
	
	abstract public void export() throws DocumentException, IOException;
	
}

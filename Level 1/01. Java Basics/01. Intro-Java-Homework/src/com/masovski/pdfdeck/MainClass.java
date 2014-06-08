package com.masovski.pdfdeck;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

public class MainClass {

	public static void main(String[] args) {
		
		Document doc = new Document();
		PdfWriter writer;
		
		int spacing = 10;
		float rectWidth = 35;
		float rectHeight = 60;
		float rectY = doc.getPageSize().getTop() - (rectHeight + spacing);
		float rectX = 10;
		char[] suit = {'♥', '♣', '♦', '♠'};
		
		try {
			writer = PdfWriter.getInstance(doc, new FileOutputStream("Deck-of-Cards.pdf"));
			doc.open();
			PdfContentByte cb = writer.getDirectContent();
			
			//Text settings
			cb.saveState();
			BaseFont myFont = BaseFont.createFont("res/arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
			cb.setColorStroke(CMYKColor.BLACK);
			cb.setFontAndSize(myFont, 24.0f);
			
			//for loops that are making the cards
			
				for (int color = 0; color < suit.length; color++) {
					switch (color) {
					case 0:
						cb.setColorFill(BaseColor.RED);
						break;
					case 2:
						cb.setColorFill(BaseColor.RED);
						break;
					default:
						cb.setColorFill(BaseColor.BLACK);
						break;
					}
					for (int card = 2; card < 15; card++) {
					cb.rectangle(rectX, rectY, rectWidth, rectHeight);
					cb.stroke();
					cb.beginText();
					cb.moveText(rectX + 10, rectY + 35);
					
					switch (card) {
					case 10: 
						cb.moveText(-7, 0);
						cb.showText("10");
						cb.moveText(+8, -25);
						cb.showText(suit[color] + "");
						break;
					case 11:
						cb.showText("J");
						cb.moveText(0, -25);
						cb.showText(suit[color] + "");
						break;
					case 12:
						cb.moveText(-2, 0);
						cb.showText("Q");
						cb.moveText(+3, -25);
						cb.showText(suit[color] + "");
						break;
					case 13:
						cb.showText("K");
						cb.moveText(0, -25);
						cb.showText(suit[color] + "");
						break;
					case 14:
						cb.showText("A");
						cb.moveText(0, -25);
						cb.showText(suit[color] + "");
						break;
					default:
						cb.moveText(+1, 0);
						cb.showText(card + "");
						cb.moveText(0, -25);
						cb.showText(suit[color] + "");
						break;
					}
					rectX += rectWidth + spacing;
					if(card == 14) {
						rectX = 10;
						rectY = rectY - (75 + spacing);
					}
					cb.endText();
				}
			}
			
		    cb.restoreState();
		    doc.close();
		    
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
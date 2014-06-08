package com.masovski.paintsvghouse;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class PaintAHouseAsSVG {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		float leftBottomTriangleX = 12.5f * 20f;
		float leftTopTriangleX = 17.5f * 20f;
		float leftBottomTriangleY = 8.5f * 20f;
		float leftTopTriangleY = 3.5f * 20f;
		
		float rightBottomTriangleX = 22.5f * 20f;
		float rightTopTriangleX = 17.5f * 20f;
		float rightBottomTriangleY = 8.5f * 20f;
		float rightTopTriangleY = 3.5f * 20f;
		
		PrintWriter writer;
		try {
			writer = new PrintWriter("house.html", "UTF-8");
			
			writer.println("<!DOCTYPE html>");
			writer.println("<html>");
			writer.println("<body>");
			writer.println("<svg height=\"500\" width=\"500\">");
			writer.println("<polygon points=\"350,70 250,170 450,170\" style=\"fill:lightgray;fill-opacity:0.3;stroke:blue;stroke-width:2\" />");
			writer.println("<polygon points=\"350,270 350,170 250,170 250,270\" style=\"fill:lightgray;fill-opacity:0.3;stroke:blue;stroke-width:2\" />");
			writer.println("<polygon points=\"400,270 400,170 450,170 450,270\" style=\"fill:lightgray;fill-opacity:0.3;stroke:blue;stroke-width:2\" />");
			//X Axis:
			writer.println("<text x=\"190\" y=\"50\" fill=\"black\">10</text>");
			writer.println("<line x1=\"200\" y1=\"60\" x2=\"200\" y2=\"330\" opacity=\"0.3\" stroke-dasharray=\"2,2\" style=\"stroke:rgb(0,0,255);stroke-width:2\" />");
			
			writer.println("<text x=\"240\" y=\"50\" fill=\"black\">12.5</text>");
			writer.println("<line x1=\"250\" y1=\"60\" x2=\"250\" y2=\"330\" opacity=\"0.3\" stroke-dasharray=\"2,2\" style=\"stroke:rgb(0,0,255);stroke-width:2\" />");
			
			writer.println("<text x=\"290\" y=\"50\" fill=\"black\">15</text>");
			writer.println("<line x1=\"300\" y1=\"60\" x2=\"300\" y2=\"330\" opacity=\"0.3\" stroke-dasharray=\"2,2\" style=\"stroke:rgb(0,0,255);stroke-width:2\" />");
			
			writer.println("<text x=\"340\" y=\"50\" fill=\"black\">17.5</text>");
			writer.println("<line x1=\"350\" y1=\"60\" x2=\"350\" y2=\"330\" opacity=\"0.3\" stroke-dasharray=\"2,2\" style=\"stroke:rgb(0,0,255);stroke-width:2\" />");
			
			writer.println("<text x=\"390\" y=\"50\" fill=\"black\">20</text>");
			writer.println("<line x1=\"400\" y1=\"60\" x2=\"400\" y2=\"330\" opacity=\"0.3\" stroke-dasharray=\"2,2\" style=\"stroke:rgb(0,0,255);stroke-width:2\" />");
			
			writer.println("<text x=\"440\" y=\"50\" fill=\"black\">22.5</text>");
			writer.println("<line x1=\"450\" y1=\"60\" x2=\"450\" y2=\"330\" opacity=\"0.3\" stroke-dasharray=\"2,2\" style=\"stroke:rgb(0,0,255);stroke-width:2\" />");
			
			//Y Axis:
			writer.println("<text x=\"145\" y=\"75\" fill=\"black\">3.5</text>");
			writer.println("<line x1=\"180\" y1=\"70\" x2=\"470\" y2=\"70\" opacity=\"0.3\" stroke-dasharray=\"2,2\" style=\"stroke:rgb(0,0,255);stroke-width:2\" />");
			
			writer.println("<text x=\"145\" y=\"125\" fill=\"black\">6</text>");
			writer.println("<line x1=\"180\" y1=\"120\" x2=\"470\" y2=\"120\" opacity=\"0.3\" stroke-dasharray=\"2,2\" style=\"stroke:rgb(0,0,255);stroke-width:2\" />");
			
			writer.println("<text x=\"145\" y=\"175\" fill=\"black\">8.5</text>");
			writer.println("<line x1=\"180\" y1=\"170\" x2=\"470\" y2=\"170\" opacity=\"0.3\" stroke-dasharray=\"2,2\" style=\"stroke:rgb(0,0,255);stroke-width:2\" />");
			
			writer.println("<text x=\"145\" y=\"225\" fill=\"black\">11</text>");
			writer.println("<line x1=\"180\" y1=\"220\" x2=\"470\" y2=\"220\" opacity=\"0.3\" stroke-dasharray=\"2,2\" style=\"stroke:rgb(0,0,255);stroke-width:2\" />");
			
			writer.println("<text x=\"145\" y=\"275\" fill=\"black\">13.5</text>");
			writer.println("<line x1=\"180\" y1=\"270\" x2=\"470\" y2=\"270\" opacity=\"0.3\" stroke-dasharray=\"2,2\" style=\"stroke:rgb(0,0,255);stroke-width:2\" />");
			
			writer.println("<text x=\"145\" y=\"325\" fill=\"black\">16</text>");
			writer.println("<line x1=\"180\" y1=\"320\" x2=\"470\" y2=\"320\" opacity=\"0.3\" stroke-dasharray=\"2,2\" style=\"stroke:rgb(0,0,255);stroke-width:2\" />");
			
			for(int i = 0; i < n; i++) {
				
				float x = sc.nextFloat() * 20f;
				float y = sc.nextFloat() * 20f;
				
				int leftPosition = (int) Math.signum ( (leftTopTriangleX-leftBottomTriangleX)*(y-leftBottomTriangleY) - 
			             							   (leftTopTriangleY-leftBottomTriangleY)*(x-leftBottomTriangleX) );

				int rightPosition = (int) Math.signum ( (rightTopTriangleX-rightBottomTriangleX)*(y-rightBottomTriangleY) - 
														(rightTopTriangleY-rightBottomTriangleY)*(x-rightBottomTriangleX) );
				
				boolean insideTriangle = (leftPosition >= 0 && y <= leftBottomTriangleY) && 
						          		 (rightPosition <= 0 && y <= rightBottomTriangleY);
				boolean inFigureWidth = x >= 12.5f && x <= 22.5f;
				boolean inFigureHeight = y >= 8.5f && y <= 13.5f;
				boolean inFigureSpace = (x > 17.5f && y > 8.5f) && x < 20f;
				
				if(insideTriangle) {
     			writer.printf("<circle cx=\"%s\" cy=\"%s\" r=\"4\" stroke=\"black\" stroke-width=\"1\" fill=\"black\" />", x, y);
				}
				else if(inFigureWidth && inFigureHeight && !inFigureSpace) {
				writer.printf("<circle cx=\"%s\" cy=\"%s\" r=\"4\" stroke=\"black\" stroke-width=\"1\" fill=\"black\" />", x, y);
				}
				else {
					writer.printf("<circle cx=\"%s\" cy=\"%s\" r=\"4\" stroke=\"black\" stroke-width=\"1\" fill=\"lightgray\" />", x, y);
				}
				
				
			}
			writer.println("</svg>");
			writer.println("</body>");
			writer.println("</html>");
			//Close the document
			writer.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

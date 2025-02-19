package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		double x = .4;
		double y = .7;
		double x2 = .7;
		double halfWidth = .05;
		double halfHeight = .05;
		
		double x3 = .555;
		double y2 = .3;
		double halfWidth2 = .25;
		
		int redcomp = 5;
		int greencomp = 67;
		int bluecomp = 89;
		StdDraw.setPenColor(redcomp, greencomp, bluecomp);
		
		StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
		StdDraw.filledRectangle(x2, y, halfWidth, halfHeight);
		StdDraw.filledRectangle(x3, y2, halfWidth2, halfHeight);
		
	}
}
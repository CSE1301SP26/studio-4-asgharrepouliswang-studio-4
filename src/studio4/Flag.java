package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(0, 0, 0.3333, 1);
		StdDraw.setPenColor(255, 255, 0);
		StdDraw.filledRectangle(0.5, 0, 0.16666, 1);
		StdDraw.setPenColor(0, 0, 255);
		StdDraw.filledRectangle(1, 0, 0.3333, 1);
	}
}

package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		//Shape
		String shape = in.next();

		//Color
		int redcomp = in.nextInt();
		int greencomp = in.nextInt();
		int bluecomp = in.nextInt();
		StdDraw.setPenColor(redcomp, greencomp, bluecomp);
		
		//Filled
		boolean isfilled = in.nextBoolean();
		
		//Parameters
		if (shape.equals("rectangle")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			if (isfilled == false) {
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			} else {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
		}else if (shape.equals("triangle")) {
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double [] x = {x1,x2,x3};
			double [] y = {y1,y2,y3};
			if (isfilled == false) {
				StdDraw.polygon(x,y);
			}else {
				StdDraw.filledPolygon(x,y);
			}
		}else if(shape.equals("ellipse")) {
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			if (isfilled == false) {
				StdDraw.ellipse(x1, y1, x2, y2);
			}else {
				StdDraw.filledEllipse(x1, y1, x2, y2);
			}
		}
	}
}

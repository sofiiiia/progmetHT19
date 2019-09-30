/**
 * 
 */
package WS4;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;
/**
 * Program som skriver ut en schackbräde.
 * 
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-25
 *
 */
public class P4_39 {
	static final int FRAME_WIDTH = 220; // globala variabler
	static final int FRAME_HEIGT = 240;

	/**
	 * @param args
	 */
	public static void draw(Graphics g) {

		final int width = 20; // rutans storlek

		g.setColor(Color.PINK);
		int x = 0;
		int y = 0;

		for (int i = 0; i < 10; i++) { // raden
			for (int j = 0; j < 10; j++) { // kolumen
				if (j % 2 == 0) { // om j är jämn så skrivs rutan ut
					g.fillRect(x, y, width, width);
					x = x + 2 * width; // hur mycket rutan flyttas på x-axeln
				}
			}
			x = 0; // gå tillbaka till början
			y += 20; // byter rad neråt
			if (i % 2 == 0) { // om i jämn flyttas fram
				x = 20;
			}
		}
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.getContentPane().setBackground(Color.ORANGE);

		frame.setSize(FRAME_WIDTH, FRAME_HEIGT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //avslutar genom att klicka på kryss 

		JComponent component = new JComponent() {

			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics graph) {
				draw(graph);
			}
		};
		frame.add(component); //för att componenten ska visas i rutan
		frame.setVisible(true); //för att det ska komma upp en ruta
	}
}

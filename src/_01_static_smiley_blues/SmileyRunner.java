package _01_static_smiley_blues;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SmileyRunner {
	public static void main(String[] args) {
		// 1. Make a new JFrame and set it to be visible
		JFrame jf = new JFrame();
		jf.setVisible(true);
		// Set your frame's default close operation to JFrame.EXIT_ON_CLOSE
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2. Make a new JPanel
		JPanel jp = new JPanel();
		// 3. Add your panel to your frame
		jf.add(jp);
		// 7. Set the Smiley class's color variable to Smiley.YELLOW (NOT a specific smiley object's!)
		// Run it again; are your Smileys all yellow now? Also try changing them to red or green!

		// 4. Make three Smiley objects and add them to your panel
		Smiley y = new Smiley();
		Smiley b = new Smiley();
		Smiley r = new Smiley();
		jp.add(y);
		jp.add(r);
		jp.add(b);
		// 5. Pack your frame
		jf.pack();
		// 6. Run the program and make sure you see three blue Smileys!
	}
}

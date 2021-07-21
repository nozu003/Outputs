/*MAIN CLASS*/

package activity_2;

import javax.swing.*;
public class SongSales_GUI {

	static SongSales_GUI_SubClass1 SClass1 = new SongSales_GUI_SubClass1();
	static SongSales_GUI_SubClass2 SClass2 = new SongSales_GUI_SubClass2();
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "SONG LIST\n1 – Awesome Song\n2 – Hit Song\n3 – Catchy Song\n4 – Beat Song\n5 – Happy Song\n6 – Song", "ACTIVITY 2", JOptionPane.INFORMATION_MESSAGE);
		SClass1.selection = Integer.parseInt((SClass1.pane.showInputDialog("Song")));
		SClass1.price = Double.parseDouble(SClass1.pane.showInputDialog("Price"));
		SClass1.quantity = Integer.parseInt(SClass1.pane.showInputDialog("Quantity"));
		SClass2.song_selection(SClass1.selection);
		SClass2.computation(SClass1.price, SClass1.quantity);
		SClass2.display();
	}
}

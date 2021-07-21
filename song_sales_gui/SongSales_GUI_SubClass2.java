/*SUB CLASS 2*/

package activity_2;

import javax.swing.JOptionPane;

public class SongSales_GUI_SubClass2 {

	static SongSales_GUI_SubClass1 SClass1 = new SongSales_GUI_SubClass1();
	
	public String song_name;
	public double revenue_total, commission_manager, commission_site;

	public void song_selection(int selection) {
		switch(selection) {
		case 1:
			song_name = "Awesome Song";
			break;
		case 2:
			song_name = "Hit Song";
			break;
		case 3:
			song_name = "Catchy Song";
			break;
		case 4:
			song_name = "Beat Song";
			break;
		case 5:
			song_name = "Happy Song";
			break;
		case 6:
			song_name = "Song";
			break;
		}
	}
	
	public void computation(double price, int quantity) {
		revenue_total = price * (double) quantity;
		commission_manager = revenue_total * .12;	
		commission_site = revenue_total * .03;
	}
	
	public void display() {
		SClass1.pane.showMessageDialog(null, String.format(song_name + " breakdown" + "\n\nTotal sales: " + revenue_total + "\nManager commission: " + commission_manager + "\nSite commission: " + commission_site), "ACTIVITY 2", JOptionPane.INFORMATION_MESSAGE);
	}
}

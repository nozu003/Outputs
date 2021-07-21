/*SUB CLASS 2*/

package activity_1;

public class SongSales_SubClass2 {

	public String song_name = null;
	public double revenue_total, commission_manager, commission_site;
	
	public void computation(double price, int quantity) {
		revenue_total = price * (double) quantity;
		commission_manager = revenue_total * .12;	
		commission_site = revenue_total * .03;
	}
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
	
	public void display() {
		System.out.println("Total sales: " + revenue_total);
		System.out.println("Manager commission: " + commission_manager);
		System.out.println("Site commission: " + commission_site);
	}
}

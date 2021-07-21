/*MAIN CLASS*/

package activity_1;

public class SongSales {
	
	static SongSales_SubClass1 SClass1 = new SongSales_SubClass1();
	static SongSales_SubClass2 SClass2 = new SongSales_SubClass2();

	public static void main(String[] args) {
		
		System.out.println("SONG LIST");
		System.out.println("1 – Awesome Song");
		System.out.println("2 – Hit Song");
		System.out.println("3 – Catchy Song");
		System.out.println("4 – Beat Song");
		System.out.println("5 – Happy Song");
		System.out.println("6 – Song");
		System.out.println("==================================");
		
		System.out.print("Song: ");
		SClass1.selection = SClass1.key.nextInt();
		
		System.out.print("Price: ");
		SClass1.price = SClass1.key.nextDouble();
		
		System.out.print("Quantity: ");
		SClass1.quantity = SClass1.key.nextInt();
		
		System.out.println("==================================");
		SClass2.song_selection(SClass1.selection);
		System.out.println(SClass2.song_name + " breakdown");
		
		SClass2.computation(SClass1.price, SClass1.quantity);
		SClass2.display();
		
	}
}

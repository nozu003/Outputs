package vending_machine;

public class SubClass1 {

	public int price = 0;
	public int cquantity = 0;
	public void beverageSelection(int selection){
		if(selection > 0 && selection <=7 ) {
			price = 25;
		}
		else if(selection >= 8 && selection <= 14) {
			price = 35;
		}
		else if(selection >= 15 && selection <= 21) {
			price = 45;
		}
		else {
			price = -1;
		}
	}
	
	public void beverageQuantity(int quantity) {
		cquantity = quantity;
		cquantity--;
	}
}

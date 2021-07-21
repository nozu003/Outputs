package grades_calculator;

public class SubClass2 {

	
	public String remarks;
	
	public void remarksValidation(double finalGrd) {
		if(finalGrd >= 97.0 && finalGrd <= 100.0) {
			remarks = "Transmutated Grade: 1.0 \n Excellent";
		}
		else if(finalGrd >= 94.0 && finalGrd <= 96.0) {
			remarks = "Transmutated Grade: 1.25 \n Excellent";
		}
		else if(finalGrd >= 91.0 && finalGrd <= 93.0) {
			remarks = "Transmutated Grade: 1.50 \n Very Good";
		}
		else if(finalGrd >= 88.0 && finalGrd <= 90.0) {
			remarks = "Transmutated Grade: 1.75 \n Very Good";
		}
		else if(finalGrd >= 85.0 && finalGrd <= 87.0) {
			remarks = "Transmutated Grade: 2.0 \n Good";
		}
		else if(finalGrd >= 82.0 && finalGrd <= 84.0) {
			remarks = "Transmutated Grade: 2.25 \n Good";
		}
		else if(finalGrd >= 79.0 && finalGrd <= 81.0) {
			remarks = "Transmutated Grade: 2.50 \n Satisfactory";
		}
		else if(finalGrd >= 76.0 && finalGrd <= 78.0) {
			remarks = "Transmutated Grade: 2.75 \n Satisfactory";
		}
		else if(finalGrd == 75.0) {
			remarks = "Transmutated Grade: 3.0 \n Passing";
		}
		else if(finalGrd >= 65.0 && finalGrd <= 74.0) {
			remarks = "Transmutated Grade: 4.0 \n Conditional";
		}
		else if(finalGrd == 0.0) {
			remarks = "Transmutated Grade: 5.0 \nINC\nWithdrawn\nDropped";
		}
	}
}

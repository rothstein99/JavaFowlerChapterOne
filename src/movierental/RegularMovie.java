package movierental;

public class RegularMovie extends Movie {

	public RegularMovie(String title, int priceCode) {
		super(title, priceCode);
		// TODO Auto-generated constructor stub
	}
	
	public RegularMovie() {

	}
	
	public double calculate(int getDaysRented){
		double thisAmount = 2;
		
		if (getDaysRented > 2)
            thisAmount += (getDaysRented - 2) * 1.5;
		return thisAmount;

	}
}

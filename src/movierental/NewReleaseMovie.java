package movierental;

public class NewReleaseMovie extends Movie{

	public NewReleaseMovie(String title, int priceCode) {
		super(title, priceCode);
		// TODO Auto-generated constructor stub
	}
	
	public NewReleaseMovie() {
		//super(title, priceCode);
		// TODO Auto-generated constructor stub
	}

	public double calculate(int getDaysRented){
		double thisAmount = getDaysRented * 3;
		return thisAmount;

	}
	
}

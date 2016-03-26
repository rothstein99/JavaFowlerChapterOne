package movierental;

public class ChildrensMovie extends Movie {

	public ChildrensMovie(String title, int priceCode) {
		super(title, priceCode);
		// TODO Auto-generated constructor stub
	}
	
	public ChildrensMovie() {
		//super(title, priceCode);
		// TODO Auto-generated constructor stub
	}

	public double calculate(int getDaysRented){
		 double thisAmount = 1.5;
         if (getDaysRented > 3)
             thisAmount += (getDaysRented - 3) * 1.5;
         
         return thisAmount;

	}
}

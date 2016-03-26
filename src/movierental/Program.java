package movierental;


public class Program {
 
	public static void main(String args[]) {

		
		/*Movie movie1 = new Movie("Deadpool", Movie.NEW_RELEASE);
		Rental rental1 = new Rental(movie1, 5);
		customer.addRental(rental1);
		Movie movie2 = new Movie("Tron", Movie.CHILDRENS);
		Rental rental2 = new Rental(movie2, 4);
		customer.addRental(rental2);
		Movie movie3 = new Movie("Star Wars: The Force Awakens", Movie.REGULAR);
		Rental rental3 = new Rental(movie3, 3);
		customer.addRental(rental3);
		*/
		/*
		Movie movie1 = null;
		String s = "movierental.NewReleaseMovie";
		
		try {
			
			
			movie1 = (Movie) Class.forName(s).newInstance();
			movie1.setTitle("Deadpool");
			movie1.setPriceCode(Movie.NEW_RELEASE);
			//tci = (NewTaxCalc) Class.forName(s).newInstance();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		//Movie movie1 = new NewReleaseMovie("Deadpool", Movie.NEW_RELEASE);
		//Movie movie2 = new ChildrensMovie("Tron", Movie.CHILDRENS);
		//Movie movie3 = new RegularMovie("Star Wars", Movie.REGULAR);
		//Movie movie4 = new NewReleaseMovie("Divergent", Movie.NEW_RELEASE);
		//Movie movie5 = new NewReleaseMovie("10 Cloverfield Lane", Movie.NEW_RELEASE);
		
		Movie movie1 = MovieFactory.movieFactory("Deadpool", Movie.NEW_RELEASE);
		Movie movie2 = MovieFactory.movieFactory("Tron", Movie.CHILDRENS);
		Movie movie3 = MovieFactory.movieFactory("Star Wars", Movie.REGULAR);
	   Movie movie4 = MovieFactory.movieFactory("Divergent", Movie.NEW_RELEASE);
		Movie movie5 = MovieFactory.movieFactory("10 Cloverfield Lane", Movie.NEW_RELEASE);
		
		Customer customer1 = new Customer("Liver Lips");
		Customer customer2 = new Customer("John");
		Customer customer3 = new Customer("Eddie Van Halen");
		
		Rental rental1 = new Rental(movie1, 5);
		Rental rental2 = new Rental(movie2, 4);
		Rental rental3 = new Rental(movie3, 3);
		
		customer1.addRental(rental1);
		customer1.addRental(rental2);
		customer1.addRental(rental3);
		
		Rental rental4 = new Rental(movie1, 1);
		Rental rental5 = new Rental(movie3, 1);
		
		customer2.addRental(rental4);
		customer2.addRental(rental5);
		
		Rental rental6 = new Rental(movie1, 1);
		Rental rental7 = new Rental(movie4, 3);
		Rental rental8 = new Rental(movie5, 5);
		
		customer3.addRental(rental6);
		customer3.addRental(rental7);
		customer3.addRental(rental8);
		
		String statement1 = customer1.statement();
		String statement2 = customer2.statement();
		String statement3 = customer3.statement();
		
		System.out.print(statement1);
		System.out.print("\n\n");
		System.out.print(statement2);
		System.out.print("\n\n");
		System.out.print(statement3);
	}
	
	

}




/*
1. Maintain current functionality, even if it has a bug. 
	a. Create a new customer, John, and have 2 rentals of a day each.  Compare the old program results vs the improved program results.
	b. Create a new customer, Eddie Van Halen, and have 3 rentals, all new release, with 1 day, 3 days, and 5 days.  Compare.
2. Your boss has said that they expect a new movie category or two may be added.
3. Your boss has said that a new statement method will be added very very soon.
	a. It will mostly like return Html infused text but it could Xml or even json instead.
4. Please clean up the code to make it more maintainable and scalable.
5. Please keep in mind the team's coding standards.
*/

//
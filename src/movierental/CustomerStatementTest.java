package movierental;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class CustomerStatementTest {

	@Test
	public void test() {
		Customer customer1 = new Customer("Liver Lips");
		Movie movie1 = MovieFactory.movieFactory("Deadpool", Movie.NEW_RELEASE);
		Movie movie2 = MovieFactory.movieFactory("Tron", Movie.CHILDRENS);
		Movie movie3 = MovieFactory.movieFactory("Star Wars", Movie.REGULAR);
		Rental rental1 = new Rental(movie1, 5);
		Rental rental2 = new Rental(movie2, 4);
		Rental rental3 = new Rental(movie3, 3);
		
		customer1.addRental(rental1);
		customer1.addRental(rental2);
		customer1.addRental(rental3);
		
		String statement1 = customer1.statement();
		assertEquals("Rental Record for Liver Lips\n\tDeadpool\t15.0\n\tTron\t3.0\n\tStar Wars\t3.5\nAmount owed is 21.5\nYou earned 4 frequent renter points", statement1);
	}

}

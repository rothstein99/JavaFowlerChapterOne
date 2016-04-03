package movierental;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class CustomerStatementTest {

	Customer customer;
	Movie deadPoolMovie;
	Movie tronMovie;
	Movie starWarsMovie;

	@Before
	public void init(){
		customer = new Customer("Liver Lips");
		deadPoolMovie = MovieFactory.create("Deadpool", Movie.NEW_RELEASE);
		tronMovie = MovieFactory.create("Tron", Movie.CHILDRENS);
		starWarsMovie = MovieFactory.create("Star Wars", Movie.REGULAR);
	}
	
	@Test
	public void getStatementAllRentalsForOneDay() {
		Customer liverLips = new Customer("Liver Lips");
		liverLips.addRental(new Rental(deadPoolMovie, 1));
		liverLips.addRental(new Rental(tronMovie, 1));
		liverLips.addRental(new Rental(starWarsMovie, 1));
		
		String expectedStatement = 
				"Rental Record for Liver Lips\n"
				+ "\tDeadpool\t3.0\n"
				+ "\tTron\t1.5\n"
				+ "\tStar Wars\t2.0\n"
				+ "Amount owed is 6.5\n"
				+ "You earned 3 frequent renter points";
		assertEquals(expectedStatement, liverLips.statement());
	}
	
	@Test
	public void getStatementAllRentalsForTwoDays() {
		Customer liverLips = new Customer("Liver Lips");
		liverLips.addRental(new Rental(deadPoolMovie, 2));
		liverLips.addRental(new Rental(tronMovie, 2));
		liverLips.addRental(new Rental(starWarsMovie, 2));
		
		String expectedStatement = 
				"Rental Record for Liver Lips\n"
				+ "\tDeadpool\t6.0\n"
				+ "\tTron\t1.5\n"
				+ "\tStar Wars\t2.0\n"
				+ "Amount owed is 9.5\n"
				+ "You earned 4 frequent renter points";
		assertEquals(expectedStatement, liverLips.statement());
	}
	
	@Test
	public void getStatementAllRentalsForThreeDays() {
		Customer liverLips = new Customer("Liver Lips");
		liverLips.addRental(new Rental(deadPoolMovie, 3));
		liverLips.addRental(new Rental(tronMovie, 3));
		liverLips.addRental(new Rental(starWarsMovie, 3));
		
		String expectedStatement = 
				"Rental Record for Liver Lips\n"
				+ "\tDeadpool\t9.0\n"
				+ "\tTron\t1.5\n"
				+ "\tStar Wars\t3.5\n"
				+ "Amount owed is 14.0\n"
				+ "You earned 4 frequent renter points";
		assertEquals(expectedStatement, liverLips.statement());
	}
	
	@Test
	public void getStatementOneWeekForDeadpool() {
		Customer liverLips = new Customer("Liver Lips");
		liverLips.addRental(new Rental(deadPoolMovie, 7));
		
		String expectedStatement = 
				"Rental Record for Liver Lips\n"
				+ "\tDeadpool\t21.0\n"
				+ "Amount owed is 21.0\n"
				+ "You earned 2 frequent renter points";
		assertEquals(expectedStatement, liverLips.statement());
	}
	
	@Test
	public void getStatementOneWeekForTron() {
		Customer liverLips = new Customer("Liver Lips");
		liverLips.addRental(new Rental(tronMovie, 7));
		
		String expectedStatement = 
				"Rental Record for Liver Lips\n"
				+ "\tTron\t7.5\n"
				+ "Amount owed is 7.5\n"
				+ "You earned 1 frequent renter points";
		assertEquals(expectedStatement, liverLips.statement());
	}
	
	@Test
	public void getStatementOneWeekForStarWars() {
		Customer liverLips = new Customer("Liver Lips");
		liverLips.addRental(new Rental(starWarsMovie, 7));
		
		String expectedStatement = 
				"Rental Record for Liver Lips\n"
				+ "\tStar Wars\t9.5\n"
				+ "Amount owed is 9.5\n"
				+ "You earned 1 frequent renter points";
		assertEquals(expectedStatement, liverLips.statement());
	}
}

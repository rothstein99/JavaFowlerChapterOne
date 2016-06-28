package movierental;
import org.junit.Before;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class RentalTests {

	Movie newRelease;
	Movie childrens;

	@Before
	public void init(){
		newRelease = new Movie("Independence Day", Movie.NEW_RELEASE);
		childrens = new Movie("Finding Nemo", Movie.CHILDRENS);
	}
	
	@Test
	public void OneDayRentalOfNewReleaseMovie() {
		Rental rental = new Rental(newRelease, 1);
		assertEquals("Expected 3.0 because that what a new release movie got on our customer tests", 3.0, rental.getCharge(), .00001);
	}
	
	@Test
	public void TwoDayRentalOfChildrensMovie() {
		Rental rental = new Rental(childrens, 2);
		assertEquals(1.5, rental.getCharge(), .00001);
	}
	
	/*
	 * Test the other two movie types.  Test with 0, 1, 5, 
	 * 
	 */
}

package movierental;

public class MovieFactory {
	public static Movie movieFactory(String title, int priceCode){
		Movie movie = null;
		String s = "";
		if (priceCode==Movie.REGULAR){
			s = "movierental.RegularMovie";
		}
		if (priceCode==Movie.NEW_RELEASE){
			s = "movierental.NewReleaseMovie";
		}
		if (priceCode==Movie.CHILDRENS){
			s = "movierental.ChildrensMovie";
		}	
		
		try {
			
			movie = (Movie) Class.forName(s).newInstance();
			movie.setTitle(title);
			movie.setPriceCode(priceCode);
			//tci = (NewTaxCalc) Class.forName(s).newInstance();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return movie;
	}
}
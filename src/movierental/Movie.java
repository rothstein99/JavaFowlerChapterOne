package movierental;

abstract public class Movie {

    public static final int CHILDRENS = 2;
    public static final int NEW_RELEASE = 1;
    public static final int REGULAR = 0;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }
    
    public Movie(){
    	
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }
    public String getTitle() {
        return _title;
    }

    public void setTitle(String arg) {
        _title = arg;
    }
    
    abstract public double calculate(int daysRented);
    /*
	public double calculate(int daysRented) {
		// TODO Auto-generated method stub
		double thisAmount=0;
		return thisAmount;
	}
	*/
    
}
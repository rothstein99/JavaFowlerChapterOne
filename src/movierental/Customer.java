package movierental;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String _name;
    private List<Rental> _rentals = new ArrayList<Rental>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
    	StatementInfo statementInfo = new StatementInfo();
    	statementInfo.totalAmount = 0;
    	statementInfo.frequentRenterPoints = 0;
        String result = "Rental Record for " + getName() + "\n";

        for (Rental each: _rentals) {
        	statementInfo.thisAmount = 0;

            //determine amounts for each line
            /*switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2)
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3)
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    break;
            }
*/
            statementInfo.movie = each.getMovie();
            statementInfo.thisAmount += statementInfo.movie.calculate(each.getDaysRented());
           /*
             switch (each.getMovie().getPriceCode()) {
            
            case Movie.REGULAR:
            	RegularMovie regularMovie = (RegularMovie) each.getMovie();
            	thisAmount +=regularMovie.calculate(each.getDaysRented());
                break;
            case Movie.NEW_RELEASE:
            	NewReleaseMovie newReleaseMovie = (NewReleaseMovie) each.getMovie();
            	thisAmount +=newReleaseMovie.calculate(each.getDaysRented());
                break;
            case Movie.CHILDRENS:
                ChildrensMovie childrensMovie = (ChildrensMovie) each.getMovie();
                thisAmount +=childrensMovie.calculate(each.getDaysRented());
                break;
        }
          */  
            // add frequent renter points
            statementInfo.frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
            	statementInfo.frequentRenterPoints++;

            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(statementInfo.thisAmount) + "\n";
            //totalAmount += thisAmount;
            statementInfo.totalAmount += statementInfo.thisAmount;
        }

        // add footer lines
        result += "Amount owed is " + String.valueOf(statementInfo.totalAmount) + "\n";
        result += "You earned " + String.valueOf(statementInfo.frequentRenterPoints) + " frequent renter points\n\n";

        return result;
    }
}
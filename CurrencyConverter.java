public abstract class CurrencyConverter extends UnitConverter{
	public CurrencyConverter() {}
	public boolean checkInput(double input){
	    if (new Double(input).longValue()<=0 && input != 0){
	    	System.err.println("Input is negative");
	        return false;
	    }

    return true;
  }
};
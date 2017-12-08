public class EuroToDollarConverter extends CurrencyConverter{
	public EuroToDollarConverter() {}

	public double convert(double inEuros) {
    	if (checkInput(inEuros)){
        return inEuros*1.18;
      } else{
        return 1;
      }
  	}

  	public String toString(){
    	return "Euro to Dollar Converter";
  	}

  	public void print(){
    	System.out.println(toString());
  	}
}
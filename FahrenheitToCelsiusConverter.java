public class FahrenheitToCelsiusConverter extends ConcreteDecorator{

	public FahrenheitToCelsiusConverter() {
    super.convee = null;
  }

  public FahrenheitToCelsiusConverter(iConverter convee){
    super(convee);
  }

	public double convert(double inFahrenheit) {
    if(super.convee != null){
      return (super.convee.convert(inFahrenheit)-32)*5/9;
    }
    else{
    	return (inFahrenheit-32)*5/9;
  	}
  }

	public String toString(){
  	return "Fahrenheit to Celsius Converter";
	}

	public void print(){
  	System.out.println(toString());
	}
}
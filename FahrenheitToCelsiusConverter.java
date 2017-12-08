public class FahrenheitToCelsiusConverter extends TemperatureConverter{
	public FahrenheitToCelsiusConverter() {}
	public double convert(double inFahrenheit) {
    	return (inFahrenheit-32)*5/9;
  	}

  	public String toString(){
    	return "Fahrenheit to Celsius Converter";
  	}

  	public void print(){
    	System.out.println(toString());
  	}
}
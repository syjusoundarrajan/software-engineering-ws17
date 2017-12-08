public class CelsiusToFahrenheitConverter extends TemperatureConverter
{
  public CelsiusToFahrenheitConverter() { }

  public double convert(double inCelsius) {
    return inCelsius*32;
  }

  public String toString(){
    return "Celsius to Fahrenheit Converter";
  }

  public void print(){
    System.out.println(toString());
  }
};
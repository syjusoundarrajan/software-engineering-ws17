public class CelsiusToFahrenheitConverter extends ConcreteDecorator
{
  public CelsiusToFahrenheitConverter() {
    super.convee = null;
  }

  public double convert(double inCelsius) {
    if(super.convee != null){
      return super.convee.convert(inCelsius)*9/5 + 32;
    }
    else{
    return inCelsius*9/5 + 32;
    }
  }

  public String toString(){
    return "Celsius to Fahrenheit Converter";
  }

  public void print(){
    System.out.println(toString());
  }
};
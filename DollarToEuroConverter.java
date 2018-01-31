public class DollarToEuroConverter extends ConcreteDecorator
{

  public DollarToEuroConverter() {
    super.convee = null;
  }

  public DollarToEuroConverter(iConverter convee) {
    super(convee);
  }

  public double convert(double inDollars) {
    if(super.convee != null){
      return super.convee.convert(inDollars)*0.85;
    }
    else{
      return inDollars*0.85;
    }
  }

  public String toString(){
    return "Dollar to Euro Converter";
  }

  public void print(){
    System.out.println(toString());
  }

  
};

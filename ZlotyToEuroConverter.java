  public class ZlotyToEuroConverter extends ConcreteDecorator
  {
  protected iConverter convee;

  public ZlotyToEuroConverter() {
    super.convee = null;
  }

  public ZlotyToEuroConverter(iConverter convee) {
    super(convee);
  }

  public double convert(double inZloty) {
    if(super.convee != null){
      return super.convee.convert(inZloty)*0.24;
    }
    else{
      return inZloty*0.24;
    }
  }

  public String toString(){
    return "Zloty to Euro Converter";
  }

  public void print(){
    System.out.println(toString());
  }


  };
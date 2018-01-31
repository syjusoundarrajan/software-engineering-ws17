  public class EuroToZlotyConverter extends ConcreteDecorator
  {
  protected iConverter convee;

  public EuroToZlotyConverter() {
    super.convee = null;
  }

  public EuroToZlotyConverter(iConverter convee) {
    super(convee);
  }

  public double convert(double inEuro) {
    if(super.convee != null){
      return super.convee.convert(inEuro)*4.2;
    }
    else{
      return inEuro*4.2;
    }
  }

  public String toString(){
    return "Euro To Zloty Converter";
  }

  public void print(){
    System.out.println(toString());
  }


  };
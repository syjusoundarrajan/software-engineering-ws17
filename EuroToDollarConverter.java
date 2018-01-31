public class EuroToDollarConverter extends ConcreteDecorator{
	
  protected iConverter convee;

  public EuroToDollarConverter() {
    super.convee = null;
  }

  public EuroToDollarConverter(iConverter convee){
    super(convee);
  }

	public double convert(double inEuros) {
    if(super.convee != null){
      return super.convee.convert(inEuros)*1.18;
    }
    else{
      return inEuros*1.18;
    } 
  }

	public String toString(){
  	return "Euro to Dollar Converter";
	}

	public void print(){
  	System.out.println(toString());
	}
}
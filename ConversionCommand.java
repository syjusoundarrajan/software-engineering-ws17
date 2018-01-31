public class ConversionCommand implements Command{

	Parameter<Double> param;
	ConcreteDecorator cDec;

	public ConversionCommand(ConcreteDecorator cDec, Parameter<Double> param){
		this.cDec = cDec;
		this.param = param;
	}


	public void execute(){
		System.out.println(cDec.convert(param.getValue()));
	}

}
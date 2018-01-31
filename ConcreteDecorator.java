public abstract class ConcreteDecorator implements iConverter{
	protected iConverter convee;

	public ConcreteDecorator(iConverter convee){
		this.convee = convee;
	}

	public ConcreteDecorator(){}

	public double convert(double inValue){
		return convee.convert(inValue);
	}
}
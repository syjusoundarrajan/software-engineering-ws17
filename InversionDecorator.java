public abstract class InversionDecorator implements iConverter{
	protected iConverter convee;

	public InversionDecorator(iConverter convee){
		this.convee = convee;
	}

	public InversionDecorator(){}

	public double convert(double inValue){
		return convee.convert(inValue);
	}
}
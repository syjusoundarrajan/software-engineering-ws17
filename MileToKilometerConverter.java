public class MileToKilometerConverter extends LengthConverter{
	public MileToKilometerConverter() {}
	public double convert(double inMile) {
		return inMile*1.6;
	}

	public String toString(){
	  return "Mile to Kilometer Converter";
	}

	public void print(){
	  System.out.println(toString());
	}
}
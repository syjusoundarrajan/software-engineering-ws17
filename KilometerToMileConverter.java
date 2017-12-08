public class KilometerToMileConverter extends LengthConverter{
	public KilometerToMileConverter() {}
	public double convert(double inKilometer) {
    	return inKilometer*0.62;
  	}

  	public String toString(){
  	  return "Kilometer to Mile Converter";
  	}
	
  	public void print(){
  	  System.out.println(toString());
  	}
}
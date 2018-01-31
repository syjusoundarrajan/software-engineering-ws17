import java.util.*;

public class Inversion extends InversionDecorator{
	private String[] conversion;
	private List blacklist = new ArrayList();

	public Inversion(String[] conversion){
		this.conversion = prepareConversion(conversion);
		createBlackList();
	}

	public double convert(double inValue){
		if (conversion != null){
			ConverterFactory factory = ConverterFactory.getInstance();
			Collections.reverse(Arrays.asList(this.conversion));
			ConcreteDecorator cDec = factory.create(conversion);
			if (cDec != null){
				return cDec.convert(inValue);
			}
		}
		return -1.0;
	}

	private String[] prepareConversion(String[] conversion){
		String[] temp;
		for(int i = 0; i<conversion.length; i++){
			temp = conversion[i].split("To");
			conversion[i] = temp[1] + "To" + temp[0];
		}
		return conversion;
	}

	private void createBlackList(){
		blacklist.add("Fahrenheit");
		blacklist.add("Celsius");
	}

	private boolean isInBlacklist(String[] conversion){
		boolean isInList = false;
		String[] temp;
		for (int i = 0; i<conversion.length; i++){
			temp = conversion[i].split("To");
			if(blacklist.contains(temp[0]) || blacklist.contains(temp[1])){
				isInList = true;
				System.out.println("No inversion of desired conversion possible");
			}
		}
		return isInList;
	}

}
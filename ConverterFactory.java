import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Arrays;
import java.lang.reflect.InvocationTargetException;

public class ConverterFactory{

	private static final ConverterFactory INSTANCE = new ConverterFactory();

	private Map<String, Class> m;

	private void createMap(){
		m = new LinkedHashMap<String, Class>();
		m.put("DollarToEuro", DollarToEuroConverter.class);
		m.put("EuroToZloty", EuroToZlotyConverter.class);
		m.put("EuroToDollar", EuroToDollarConverter.class);
		m.put("ZlotyToEuro", ZlotyToEuroConverter.class);
		m.put("FahrenheitToCelsius", FahrenheitToCelsiusConverter.class);
		m.put("CelsiusToFahrenheit", CelsiusToFahrenheitConverter.class);
	}

	private ConverterFactory(){
		createMap();
	}

	public static ConverterFactory getInstance(){
		return INSTANCE;
	}

	public ConcreteDecorator create(String[] conversion){
		if (checkConversion(conversion)){
			Class c;
			if(conversion.length == 1){
				c = m.get(conversion[0]);
				try{
					return (ConcreteDecorator) c.newInstance();
				} catch(InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (NullPointerException e){
					e.printStackTrace();
				}
			}
			else{
				c = m.get(conversion[conversion.length -1]);
				conversion = Arrays.copyOf(conversion, conversion.length-1);
				try{
					return (ConcreteDecorator) c.getDeclaredConstructor(iConverter.class).newInstance(create(conversion));
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NullPointerException e){
					e.printStackTrace();
				} catch (InstantiationException e){
					e.printStackTrace();
				} catch (IllegalAccessException e){
					e.printStackTrace();
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	private boolean checkConversion(String[] conversion){
		if (conversion.length <= 1){
			return true;
		}
		else{
			String[] conversionFactors1 = conversion[0].split("To");
			String[] conversionFactors2 = conversion[1].split("To");
			if (conversionFactors1[1].equals(conversionFactors2[0])){
				conversion = Arrays.copyOfRange(conversion, 1, conversion.length);
				return checkConversion(conversion);
			}
			else{
				System.out.println("wrong conversion chain");
				return false;
			}
		}
	}
}
import java.util.*;

public class Invoker{
	private Command command;
	private ConverterFactory factory;

	public Invoker(ConverterFactory factory){
		this.factory = factory;
	}

	public void invoke(Map<String, Double> map){
		Set<String> keys = map.keySet();
		for (String k: keys){
			ConcreteDecorator cDec = factory.create(new String[]{k});
			if (cDec != null){
				System.out.print("Input: " + map.get(k) + " conversion: " + k + " result : ");
				command = new ConversionCommand(cDec, new Parameter<Double>(new Double(map.get(k))));
				command.execute();
			}
		}
	}
}
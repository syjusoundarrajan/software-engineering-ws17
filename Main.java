import java.util.*;

public class Main{

	private static Map<String, Double> map;

	public static void main(String[] args)
	  {
	    //String conversion = args[0];
	    //String value = args[1];
	    
	    //System.out.println(execute(conversion, value));
	    //System.out.println(executeWithFactory(conversion, value));

	    String[] conversion = Arrays.copyOf(args, args.length-1);
	    int value = Integer.parseInt(args[args.length-1]);

	    executeChain(conversion, value);

	    Inversion inversion = new Inversion(conversion);
	    System.out.println("inverted: " + inversion.convert(value));
	    
	    fillMap();
	    Invoker invoke = new Invoker(ConverterFactory.getInstance());
	    invoke.invoke(map);
	    
	  }

	public static void executeChain(String[] conversion, int value){
		ConverterFactory factory = ConverterFactory.getInstance();
		ConcreteDecorator cDec = factory.create(conversion);
		if (cDec != null){
			System.out.println(cDec.convert(value));
		}
	}

	public static void fillMap(){
		map = new LinkedHashMap<String, Double>();
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String conversion = scan.nextLine();
			Double value = scan.nextDouble();
			map.put(conversion, value);
			scan.nextLine();
		}
	}
}
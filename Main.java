class Main {
  public static void main(String[] args)
  {
    String conversion = args[0];
    String value = args[1];
    
    //System.out.println(execute(conversion, value));
    System.out.println(executeWithFactory(conversion, value));
    
  }

  public static String execute(String conversion, String value){
    UnitConverter myConverter = null;
    boolean checkIn;
    switch (conversion){
        case "DollarToEuro":
            myConverter = new DollarToEuroConverter();
            break;
        case "EuroToDollar":
            myConverter = new EuroToDollarConverter();
            break;
        case "CelsiusToFahrenheit":
            myConverter = new CelsiusToFahrenheitConverter();
            break;
        case "FahrenheitToCelsius":
            myConverter = new FahrenheitToCelsiusConverter();
            break;
        case "KilometerToMile":
            myConverter = new KilometerToMileConverter();
            break;
        case "MileToKilometer":
            myConverter = new MileToKilometerConverter();
            break;
        default:
            return "wrong conversion";
    }

    if(myConverter != null){
        double result = myConverter.convert(Double.parseDouble(value));
        return myConverter.toString() + ": " + value + " to " + result ;
    }
    return "Something went wrong";
  }

  public static String executeWithFactory(String conversion, String value){
    ConverterFactory cf = ConverterFactory.getInstance();
    UnitConverter uc = cf.create(conversion);
    if(uc != null){
        double result = uc.convert(Double.parseDouble(value));
        return uc.toString() + ": " + value + " to " + result ;
    }
    return "Something went wrong";
  }
}

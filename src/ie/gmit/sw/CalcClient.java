package ie.gmit.sw;

public class CalcClient {

	public static void main(String[] args)  throws Throwable{
	
		CalculatorService sc = new CalculatorServiceLocator();
		Calculator_PortType rc = sc.getCalculator();
		int result = rc.add(10, 5);
		System.out.println(result);
		
		
	}
}

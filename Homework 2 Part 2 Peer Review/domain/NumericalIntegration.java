import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class NumericalIntegration{

	double lowerBound;
	double upperBound;
	double stepSize;
	
	public static void main(String[] args) {
		NumericalIntegration numericalIntegration = new NumericalIntegration();
	}
	
	public NumericalIntegration() {
		performAllIntegration();
	}
	
	public void performAllIntegration() {
		Map<String, Function<Double, Double>> functionMap = new HashMap<>();
		functionMap.put("f(x)=x",   (x) -> x);
		functionMap.put("f(x)=x^2", (x) -> x * x);
		functionMap.put("f(x)=x^3", (x) -> x * x * x);
		functionMap.put("f(x)=x^4", (x) -> x * x * x * x);
		
		this.lowerBound=-1;
		this.upperBound=1;
		this.stepSize=0.01;
		
		String[] functionTextInSortedOrder = functionMap.keySet().stream().sorted().toArray((size) -> new String[size]);
		for(String functionText : functionTextInSortedOrder) {
			Function<Double, Double> f_x = functionMap.get(functionText);
			
			System.out.println("Definite integral of "+functionText+" from "+lowerBound+" to "+upperBound+":");
			doIntegration(new AreaUnderTheCurveDecorator(new TrapezoidIntegration()), f_x);
			
			doIntegration(new AreaUnderTheCurveDecorator(new SimpsonIntegration()), f_x);
			doIntegration(new AreaUnderTheCurveDecorator(new ThreeEightsIntegration()), f_x);
			doIntegration(new AreaUnderTheCurveDecorator(new BooleanIntegration()), f_x);
			System.out.println();
		}
		
	}
	
	public void doIntegration(IntegrationMethod integrationMethod, Function<Double, Double> f_x) {
		double returnValue = 0;
		for (double x_i = lowerBound; x_i < upperBound; x_i += stepSize) {
			returnValue += integrationMethod.integrate(f_x, x_i, stepSize);
		}
		System.out.printf("	%s returned: %.4f" + System.lineSeparator(), integrationMethod.getName(), returnValue);
	}
}

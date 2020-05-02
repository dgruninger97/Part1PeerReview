import java.util.function.Function;

public class SimpsonIntegration implements IntegrationMethod{

	@Override
	public double integrate(Function<Double, Double> f, double upperBound, double stepSize) {
		stepSize = stepSize / 2;
		double f_0 = f.apply(upperBound);
		double f_1 = f.apply(upperBound + stepSize);
		double f_2 = f.apply(upperBound + stepSize + stepSize);

		return stepSize / 3.0 * (f_0 + 4 * f_1 + f_2);
	}

	@Override
	public String getName() {
		return "simpson";
	}

}

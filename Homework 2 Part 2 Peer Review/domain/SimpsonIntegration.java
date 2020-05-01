import java.util.function.Function;

public class SimpsonIntegration implements IntegrationMethod{

	@Override
	public double integrate(Function<Double, Double> f, double x_i, double stepSize) {
		stepSize = stepSize / 2;
		double f_0 = f.apply(x_i);
		double f_1 = f.apply(x_i + stepSize);
		double f_2 = f.apply(x_i + stepSize + stepSize);

		return stepSize / 3.0 * (f_0 + 4 * f_1 + f_2);
	}

	@Override
	public String getName() {
		return "simpson";
	}

}

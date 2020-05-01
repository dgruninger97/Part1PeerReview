import java.util.function.Function;

public class TrapezoidIntegration implements IntegrationMethod{
	@Override
	public double integrate(Function<Double, Double> f, double x_i, double stepSize) {
		double f_0 = f.apply(x_i);
		double f_1 = f.apply(x_i + stepSize);

		return stepSize / 2.0 * (f_0 + f_1);
	}

	@Override
	public String getName() {
		return "trapezoid";
	}

}

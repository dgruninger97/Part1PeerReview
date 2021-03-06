import java.util.function.Function;

public class BooleanIntegration implements IntegrationMethod{


	@Override
	public double integrate(Function<Double, Double> f_x, double upperBound, double stepSize) {
		stepSize = stepSize / 4;
		double f_0 = f_x.apply(upperBound);
		double f_1 = f_x.apply(upperBound + stepSize);
		double f_2 = f_x.apply(upperBound + stepSize + stepSize);
		double f_3 = f_x.apply(upperBound + stepSize + stepSize + stepSize);
		double f_4 = f_x.apply(upperBound + stepSize + stepSize + stepSize + stepSize);

		return 2 * stepSize / 45.0 * (7 * f_0 + 32 * f_1 + 12 * f_2 + 32 * f_3 + 7 * f_4);
	}

	@Override
	public String getName() {
		return "boole";
	}

}

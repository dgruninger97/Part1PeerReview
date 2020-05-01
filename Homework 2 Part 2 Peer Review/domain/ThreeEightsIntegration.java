import java.util.function.Function;

public class ThreeEightsIntegration implements IntegrationMethod{

	@Override
	public double integrate(Function<Double, Double> f, double x_i, double stepSize) {
		stepSize = stepSize / 3;
		double f_0 = f.apply(x_i);
		double f_1 = f.apply(x_i + stepSize);
		double f_2 = f.apply(x_i + stepSize + stepSize);
		double f_3 = f.apply(x_i + stepSize + stepSize + stepSize);

		return 3 * stepSize / 8.0 * (f_0 + 3 * f_1 + 3 * f_2 + f_3);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "3/8";
	}

}

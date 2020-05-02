import java.util.function.Function;

public class ThreeEightsIntegration implements IntegrationMethod{

	@Override
	public double integrate(Function<Double, Double> f, double upperBound, double stepSize) {
		stepSize = stepSize / 3;
		double f_0 = f.apply(upperBound);
		double f_1 = f.apply(upperBound + stepSize);
		double f_2 = f.apply(upperBound + stepSize + stepSize);
		double f_3 = f.apply(upperBound + stepSize + stepSize + stepSize);

		return 3 * stepSize / 8.0 * (f_0 + 3 * f_1 + 3 * f_2 + f_3);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "3/8";
	}

}

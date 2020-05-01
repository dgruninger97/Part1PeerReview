import java.util.function.Function;

public class AreaUnderTheCurveDecorator extends IntegrationDecorator{

	public AreaUnderTheCurveDecorator(IntegrationMethod integrationMethod) {
		super(integrationMethod);
	}

	@Override
	public double integrate(Function<Double, Double> f_x, double upperBound, double stepSize) {
		return Math.abs(this.integrationMethod.integrate(f_x, upperBound, stepSize));
	}

	@Override
	public String getName() {
		return this.integrationMethod.getName();
	}
}

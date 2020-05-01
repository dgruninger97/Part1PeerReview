import java.util.function.Function;

public abstract class IntegrationDecorator implements IntegrationMethod{

	IntegrationMethod integrationMethod;
	public IntegrationDecorator(IntegrationMethod integrationMethod) {
		this.integrationMethod = integrationMethod;
	}
	
	@Override
	public double integrate(Function<Double, Double> f_x, double upperBound, double stepSize) {
		return this.integrationMethod.integrate(f_x, upperBound, stepSize);
	}

	@Override
	public String getName() {
		return this.integrationMethod.getName();
	}
	
}

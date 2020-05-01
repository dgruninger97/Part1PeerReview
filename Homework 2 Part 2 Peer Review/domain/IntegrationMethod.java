import java.util.function.Function;

public interface IntegrationMethod {

	public double integrate(Function<Double, Double> f_x, double upperBound, double stepSize);

	public String getName();

}

package lab17;

public class CalculateIntegralTrapezia extends AbstractCalculateIntegral {
    private static final int N = 1000;

    public CalculateIntegralTrapezia(double a, double b, Function function) {

        super(a, b, function);
    }

    public double get() {
        double sum = 0;
        double h = (b - a) / N;

        for (int i = 0; i < N; i++) {
            //значение функции на левой и правой границах интервала
            double left = function.calculate(a + h * i);
            double right = function.calculate(a + h * (i + 1));
            sum += (left + right) * h / 2;
        }
        return sum;
    }
}

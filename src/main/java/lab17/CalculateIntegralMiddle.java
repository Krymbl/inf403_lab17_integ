package lab17;

public class CalculateIntegralMiddle extends AbstractCalculateIntegral{
    public CalculateIntegralMiddle(double a, double b, Function function){
        super(a, b, function);
    }
    public static final int H = 1000;


    public double get(){
        double sum = 0;
        double h = (b - a) / H;

        for (int i = 0; i < H; ++i){
            sum += h * function.calculate(a + h * (i + 0.5));
        }
        return sum;
    }

}
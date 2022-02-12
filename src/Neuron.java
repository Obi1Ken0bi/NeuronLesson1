import java.util.Random;
import java.util.function.Function;

public class Neuron {
    private final double[] args;
    private double bias;
    private double[] weights;
    private Function<Double,Double> func;
    static Random random=new Random();

    public Neuron(double[] args, Function<Double, Double> func) {
        this.args = args;
        this.func = func;

        weights=new double[args.length];
        for (int i = 0; i < weights.length; i++) {
            weights[i]=random.nextDouble()+1;
        }
        bias=random.nextDouble()+1;
    }
    public double process(){
        return func.apply(sum());
    }

    private double sum(){
        double sum=0;
        for (int i = 0; i < args.length; i++) {
            sum+=args[i]*weights[i];
        }
        sum+=bias;
        return sum;
    }
}

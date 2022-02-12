import java.util.function.Function;

public class NeuronNetwork {
    private final Neuron[] neurons;
    private Function<Double,Double> function;
    private double[] input;

    public NeuronNetwork(Integer numberOfNeurons,double[] input,Function<Double,Double>[] functions) {
         this.neurons=new Neuron[numberOfNeurons];
         this.input=input;
        for (int i = 0; i < numberOfNeurons; i++) {
            neurons[i]=new Neuron(input,functions[i]);
        }

    }


    public void initialize(){

    }

}

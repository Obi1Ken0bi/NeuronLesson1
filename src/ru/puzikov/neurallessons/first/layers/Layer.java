package ru.puzikov.neurallessons.first.layers;

import ru.puzikov.neurallessons.first.neuron.Neuron;

import java.util.Arrays;
import java.util.function.Function;

public abstract class Layer {
    private final Neuron[] neurons;

    public Layer(int numberOfNeuronsInLayer, Function<Double, Double> function, int numberOfArgs) {
        neurons = new Neuron[numberOfNeuronsInLayer];
        for (int i = 0; i < numberOfNeuronsInLayer; i++) {
            neurons[i] = new Neuron(numberOfArgs, function);
        }
    }

    public void setArgs(double[] args) {
        System.out.println(Arrays.toString(args));
        for (Neuron n : neurons) {
            n.setArgs(args);
        }
    }

    public double[] getOutput() {
        return Arrays.stream(neurons).mapToDouble(Neuron::process).toArray();
    }


}

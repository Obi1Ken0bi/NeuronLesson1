package ru.puzikov.neurallessons.first;

import java.util.Arrays;
import java.util.function.Function;

public class NeuronNetwork {
    private final Neuron[] neurons;
    private final Function<Double, Double>[] functions;
    private final double[] input;

    public NeuronNetwork(Integer numberOfNeurons, double[] input, Function<Double, Double>[] functions) {
        this.functions = functions;
        this.neurons = new Neuron[numberOfNeurons];
        this.input = input;
        for (int i = 0; i < numberOfNeurons; i++) {
            neurons[i] = new Neuron(input.length, functions[i]);
        }
        updateNeuronsInput(input);

    }

    public double[] compute() {
        double[] output = Arrays.stream(neurons).mapToDouble(neuron -> neuron.process()).toArray();
        updateNeuronsInput(output);
        return output;
    }

    private void updateNeuronsInput(double[] newInput) {
        for (Neuron n : neurons) {
            n.setArgs(newInput);
        }
    }


}

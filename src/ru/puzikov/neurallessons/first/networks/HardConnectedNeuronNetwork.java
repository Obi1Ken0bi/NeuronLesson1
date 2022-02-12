package ru.puzikov.neurallessons.first.networks;

import ru.puzikov.neurallessons.first.Neuron;

import java.util.Arrays;
import java.util.function.Function;

public class HardConnectedNeuronNetwork {
    private final Neuron[] neurons;

    public HardConnectedNeuronNetwork(Integer numberOfNeurons, double[] input, Function<Double, Double>[] functions) {
        this.neurons = new Neuron[numberOfNeurons];
        for (int i = 0; i < numberOfNeurons; i++) {
            neurons[i] = new Neuron(input.length, functions[i]);
        }
        updateNeuronsInput(input);

    }

    public double[] compute() {
        double[] output = Arrays.stream(neurons).mapToDouble(Neuron::process).toArray();
        updateNeuronsInput(output);
        return output;
    }

    private void updateNeuronsInput(double[] newInput) {
        for (Neuron n : neurons) {
            n.setArgs(newInput);
        }
    }


}

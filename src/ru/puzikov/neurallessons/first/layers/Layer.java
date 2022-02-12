package ru.puzikov.neurallessons.first.layers;

import ru.puzikov.neurallessons.first.Neuron;

import java.util.Arrays;
import java.util.function.Function;

public abstract class Layer {
    private Neuron[] neurons;
    private int numberOfNeuronsInLayer;

    public Layer(int numberOfNeuronsInLayer, Function<Double, Double> function, int numberOfArgs) {
        this.numberOfNeuronsInLayer = numberOfNeuronsInLayer;
        neurons = new Neuron[numberOfNeuronsInLayer];
        for (int i = 0; i < numberOfNeuronsInLayer; i++) {
            neurons[i] = new Neuron(numberOfArgs, function);
        }
    }

    public void setArgs(double[] args) {
        for (Neuron n : neurons) {
            n.setArgs(args);
        }
    }

    public double[] getOutput() {
        return Arrays.stream(neurons).mapToDouble(Neuron::process).toArray();
    }


    public Neuron[] getNeurons() {
        return neurons;
    }

    public void setNeurons(Neuron[] neurons) {
        this.neurons = neurons;
    }

    public int getNumberOfNeuronsInLayer() {
        return numberOfNeuronsInLayer;
    }

    public void setNumberOfNeuronsInLayer(int numberOfNeuronsInLayer) {
        this.numberOfNeuronsInLayer = numberOfNeuronsInLayer;
    }
}

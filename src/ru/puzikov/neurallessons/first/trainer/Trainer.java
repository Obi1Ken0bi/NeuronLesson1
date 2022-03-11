package ru.puzikov.neurallessons.first.trainer;

import ru.puzikov.neurallessons.first.neuron.Func;
import ru.puzikov.neurallessons.first.neuron.Neuron;
import ru.puzikov.neurallessons.first.neuron.NeuronFunctions;

import java.util.function.Function;

public class Trainer {
    private final Neuron neuron;
    private final Function<Double, Double> activator =
            NeuronFunctions.activators().getLinear();
    private final Func<Double, Double, Double, Double> errorPrime = NeuronFunctions.derivatives().getLinear();
    private final double[] examples;
    private final double[][] inputs;

    public Trainer( Neuron neuron, double[] examples, double[][] inputs) {
        this.neuron = neuron;
        this.examples = examples;
        this.inputs = inputs;
    }

    private double trainNeuron(double eta) {
        double error = 0d;
        for (int i = 0; i < examples.length; i++) {
            double[] xK = inputs[i];
            double yK = examples[i];
            neuron.setArgs(xK);
            double oK = neuron.process();
            double eK = 0.5d * Math.pow(yK - oK, 2);
            error += eK;
            correctWeights(eta, yK, oK, xK);


        }
        return error;
    }

    private void correctWeights(double eta, double yK, double oK, double[] xK) {
        for (int i = 0; i < neuron.getWeights().length; i++) {

            double value = neuron.getWeights()[i] - eta * errorPrime.apply(yK, oK, xK[i]);
            neuron.getWeights()[i] = value;
        }
    }

    public void train(int epochCount, double eta) {

        for (int i = 0; i < epochCount; i++) {
            System.out.println("Epoch: " + i + "\tDeviation: " + trainNeuron(eta));
        }
    }
}

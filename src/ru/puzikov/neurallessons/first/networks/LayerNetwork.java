package ru.puzikov.neurallessons.first.networks;

import org.jetbrains.annotations.NotNull;
import ru.puzikov.neurallessons.first.layers.HiddenLayer;
import ru.puzikov.neurallessons.first.layers.InputLayer;
import ru.puzikov.neurallessons.first.layers.Layer;
import ru.puzikov.neurallessons.first.layers.OutputLayer;

import java.util.function.Function;

public class LayerNetwork {
    private final Layer[] layers;

    public LayerNetwork(int numberOfLayers, int @NotNull [] numbersOfNeurons, Function<Double, Double> @NotNull [] functions) {
        layers = new Layer[numberOfLayers];
        layers[0] = new InputLayer(numbersOfNeurons[0]);
        layers[numberOfLayers - 1] = new OutputLayer(numbersOfNeurons[numberOfLayers - 1], functions[numberOfLayers - 1], numbersOfNeurons[numbersOfNeurons.length-2]);
        for (int i = 1; i < numberOfLayers - 1; i++) {
            layers[i] = new HiddenLayer(numbersOfNeurons[i], functions[i], numbersOfNeurons[i-1]);
        }
    }

    public double[] compute(double[] input) {
        layers[0].setArgs(input);
        for (int i = 1; i < layers.length; i++) {
            layers[i].setArgs(layers[i - 1].getOutput());
        }
        return layers[layers.length - 1].getOutput();
    }
}

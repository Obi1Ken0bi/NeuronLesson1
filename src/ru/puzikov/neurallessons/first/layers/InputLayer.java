package ru.puzikov.neurallessons.first.layers;

import java.util.function.Function;

public class InputLayer extends Layer {
    private static final Function<Double, Double> func = x -> x;

    public InputLayer(int numberOfNeuronsInLayer, int numberOfArgs) {
        super(numberOfNeuronsInLayer, func, numberOfArgs);
    }
}

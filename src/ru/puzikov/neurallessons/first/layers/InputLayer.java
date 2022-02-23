package ru.puzikov.neurallessons.first.layers;

import java.util.Arrays;
import java.util.function.Function;

public class InputLayer extends Layer {
    private static final Function<Double, Double> func = x -> x;
    private double[] args ;


    public InputLayer(int numberOfNeuronsInLayer) {
        super(numberOfNeuronsInLayer, func, numberOfNeuronsInLayer);
    }


    @Override
    public void setArgs(double[] args) {
        System.out.println("Аргументы на inputLayer: "+Arrays.toString(args));
        this.args = args;
    }

    @Override
    public double[] getOutput() {
        return args;
    }
}

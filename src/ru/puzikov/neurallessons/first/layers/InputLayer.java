package ru.puzikov.neurallessons.first.layers;

import java.util.function.Function;

public class InputLayer extends Layer {
    private static final Function<Double, Double> func = x -> x;
    private double[] args;


    public InputLayer(int numberOfNeuronsInLayer, int numberOfArgs) {
        super(numberOfNeuronsInLayer, func, numberOfArgs);
    }


    @Override
    public void setArgs(double[] args) {
        this.args=args;
    }

    @Override
    public double[] getOutput() {
        return args;
    }
}

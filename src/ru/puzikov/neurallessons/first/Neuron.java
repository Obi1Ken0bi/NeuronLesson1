package ru.puzikov.neurallessons.first;

import java.util.Random;
import java.util.function.Function;

public class Neuron {
    static final Random random = new Random();
    private final double bias;
    private final double[] weights;
    private final Function<Double, Double> func;
    private double[] args;

    public Neuron(int numberOfInput, Function<Double, Double> func) {
        this.func = func;
        args = new double[numberOfInput];

        weights = new double[args.length];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = random.nextDouble() + 1;
        }
        bias = random.nextDouble() + 1;
    }


    public double process() {
        return func.apply(sum());
    }

    private double sum() {
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i] * weights[i];
        }
        sum += bias;
        return sum;
    }

    public void setArgs(double[] args) {
        this.args = args;
    }
}

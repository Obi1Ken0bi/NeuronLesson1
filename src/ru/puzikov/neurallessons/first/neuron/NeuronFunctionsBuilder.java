package ru.puzikov.neurallessons.first.neuron;

import java.util.function.Function;

public class NeuronFunctionsBuilder {
    private final Function<Double, Double> Linear = (s) -> s;
    private final Function<Double, Double> Sigmoid = (s) -> 1d / (1 + Math.exp(-s));

    public Function<Double, Double> getLinear() {
        return Linear;
    }

    public Function<Double, Double> getSigmoid() {
        return Sigmoid;
    }
}

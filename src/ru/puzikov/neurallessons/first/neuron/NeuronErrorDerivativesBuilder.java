package ru.puzikov.neurallessons.first.neuron;


public class NeuronErrorDerivativesBuilder {

    private final Func<Double, Double, Double, Double> Sigmoid =
            (yK, oK, xK) -> -(yK - oK) * oK * (1 - oK) * xK;
    private final Func<Double, Double, Double, Double> Linear =
            (yK, oK, xK) -> -2d * (yK - oK) * xK;

    public Func<Double, Double, Double, Double> getSigmoid() {
        return Sigmoid;
    }

    public Func<Double, Double, Double, Double> getLinear() {
        return Linear;
    }
}

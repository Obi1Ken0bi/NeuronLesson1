package ru.puzikov.neurallessons.first.neuron;

public class NeuronFunctions {
    private static final NeuronFunctionsBuilder singletonFunctions = new NeuronFunctionsBuilder();
    private static final NeuronErrorDerivativesBuilder singletonDerivatives = new NeuronErrorDerivativesBuilder();

    public static NeuronFunctionsBuilder activators() {
        return singletonFunctions;
    }

    public static NeuronErrorDerivativesBuilder derivatives() {
        return singletonDerivatives;
    }
}

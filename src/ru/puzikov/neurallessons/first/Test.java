package ru.puzikov.neurallessons.first;

import ru.puzikov.neurallessons.first.neuron.Neuron;
import ru.puzikov.neurallessons.first.neuron.NeuronFunctions;
import ru.puzikov.neurallessons.first.trainer.Trainer;

public class Test {
    public static void main(String[] args) {
//        LayerNetwork network;
//        Function<Double, Double> function = x -> x;
//        network = new LayerNetwork( new int[]{5,5, 6, 7}, new Function[]{function, function, function});
//        System.out.println(Arrays.toString(network.compute(new double[]{5d, 4d, 3d, 4d, 5d})));
        var aboba = new Neuron(1, NeuronFunctions.activators().getLinear());
        var inputs = new double[][]{new double[]{1d}, new double[]{2d}};
        var results = new double[]{1d, 2d};
        var trainer = new Trainer(aboba, results, inputs);
        trainer.train(100, 0.02);

    }
}

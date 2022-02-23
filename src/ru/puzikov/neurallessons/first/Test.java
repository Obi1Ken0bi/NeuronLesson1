package ru.puzikov.neurallessons.first;

import ru.puzikov.neurallessons.first.networks.LayerNetwork;

import java.util.Arrays;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        LayerNetwork network;
        Function<Double, Double> function = x -> x;
        network = new LayerNetwork( new int[]{5,5, 6, 7}, new Function[]{function, function, function});
        System.out.println(Arrays.toString(network.compute(new double[]{5d, 4d, 3d, 4d, 5d})));
    }
}

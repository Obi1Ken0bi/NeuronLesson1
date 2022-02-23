package ru.puzikov.neurallessons.first.layers;


import java.util.Arrays;
import java.util.function.Function;

public class OutputLayer extends Layer {
    public OutputLayer(int numberOfNeuronsInLayer, Function<Double, Double> function, int numberOfArgs) {
        super(numberOfNeuronsInLayer, function, numberOfArgs);
    }

    public void print() {
        System.out.println(Arrays.toString(this.getOutput()));
    }
}

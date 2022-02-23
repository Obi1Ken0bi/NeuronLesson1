package ru.puzikov.neurallessons.first.layers;


import java.util.function.Function;
public class HiddenLayer extends Layer {

    public HiddenLayer(int numberOfNeuronsInLayer, Function<Double, Double> function, int numberOfArgs) {
        super(numberOfNeuronsInLayer, function, numberOfArgs);
    }


}

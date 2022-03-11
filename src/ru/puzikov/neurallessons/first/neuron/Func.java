package ru.puzikov.neurallessons.first.neuron;

public interface Func<A, B, C, D> {
    D apply(A a, B b, C c);
}

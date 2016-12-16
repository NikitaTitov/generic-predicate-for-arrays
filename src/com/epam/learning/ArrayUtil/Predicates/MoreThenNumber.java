package com.epam.learning.ArrayUtil.Predicates;


public class MoreThenNumber<T extends Number> implements Predicate<T> {
    private Double predicateNumber;

    public MoreThenNumber(T predicateNumber) {
        this.predicateNumber = predicateNumber.doubleValue();
    }

    @Override
    public boolean predicate(T value) {

        return value.doubleValue() < predicateNumber;
    }
}

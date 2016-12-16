package com.epam.learning.ArrayUtil.Predicates;

public class NameFilter<T extends String> implements Predicate<T> {
    private String matchName;

    public NameFilter(T matchName) {
        this.matchName = matchName;
    }

    @Override
    public boolean predicate(T names) {
        return !names.matches(matchName);
    }
}

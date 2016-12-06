package com.epam.learning.ArrayUtil;

import java.util.List;
import java.util.stream.Stream;

public class ArrayUtils {

    public static Stream<? extends Number> moreThanNumber(List<? extends Number> numbers, double predicate) {
        Stream<? extends Number> result = numbers.stream().filter(p -> p.doubleValue() > predicate);
        return result;
    }

    public static Stream<? extends String> haveName(List<? extends String> names, String name) {
        Stream<? extends String> result = names.stream().filter(p -> p.matches(name + "(.*)"));
        return result;
    }


}

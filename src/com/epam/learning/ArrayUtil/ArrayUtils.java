package com.epam.learning.ArrayUtil;

import com.epam.learning.ArrayUtil.Predicates.Predicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayUtils {

    public static <T> void filter(List<? extends T> list, Predicate<? super T> predicate) {
        for (int i = 0; i < list.size(); i++) {
            if (predicate.predicate(list.get(i))) {
                list.remove(i);
            }
        }
    }

    public static <T extends Comparable<? super T>> T findMiddleValue(List<? extends T> list){
        List<T> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return sortedList.get(sortedList.size()/2);
    }
}

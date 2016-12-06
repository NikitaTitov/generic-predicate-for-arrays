package com.epam.learning.ArrayUtil;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class ArrayUtilsTest {
    ArrayUtils utils = new ArrayUtils();

    @Test
    public void testMoreThanNumber() throws Exception {
        List<Integer> firstIntegerTestList = new ArrayList<>();
        firstIntegerTestList.add(1);
        firstIntegerTestList.add(12);
        firstIntegerTestList.add(13);
        firstIntegerTestList.add(14);
        List<Integer> secondIntegerTestList = new ArrayList<>();
        secondIntegerTestList.add(12);
        secondIntegerTestList.add(13);
        secondIntegerTestList.add(14);
        assertArrayEquals(utils.moreThanNumber(firstIntegerTestList, 1).toArray(), secondIntegerTestList.toArray());

        List<Double> firstDoubleTestList = new ArrayList<>();
        firstDoubleTestList.add(0.1);
        firstDoubleTestList.add(13.1);
        firstDoubleTestList.add(1.1);
        firstDoubleTestList.add(0.15);
        List<Double> secondDoubleTestList = new ArrayList<>();
        secondDoubleTestList.add(13.1);
        secondDoubleTestList.add(1.1);
        secondDoubleTestList.add(0.15);
        assertArrayEquals(utils.moreThanNumber(firstDoubleTestList, 0.1).toArray(), secondDoubleTestList.toArray());
    }

    @Test
    public void testHaveName() throws Exception {
        List<String> firstNameList = new ArrayList<>();
        firstNameList.add("Alice");
        firstNameList.add("Bob");
        firstNameList.add("Alice Jr.");
        firstNameList.add("Jon");
        List<String> secondNameList = new ArrayList<>();
        secondNameList.add("Alice");
        secondNameList.add("Alice Jr.");
        assertArrayEquals(utils.haveName(firstNameList, "Alice").toArray(), secondNameList.toArray());
    }
}
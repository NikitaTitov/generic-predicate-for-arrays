package com.epam.learning.ArrayUtil;

import com.epam.learning.ArrayUtil.Predicates.*;
import org.junit.Test;
import static com.epam.learning.ArrayUtil.ArrayUtils.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class ArrayUtilsTest {

    @Test
    public void testMoreThanNumber() throws Exception {
        List<Integer> firstIntegerTestList = new ArrayList<>();
        firstIntegerTestList.add(0);
        firstIntegerTestList.add(12);
        firstIntegerTestList.add(13);
        firstIntegerTestList.add(14);
        List<Integer> secondIntegerTestList = new ArrayList<>();
        secondIntegerTestList.add(12);
        secondIntegerTestList.add(13);
        secondIntegerTestList.add(14);
        filter(firstIntegerTestList, new MoreThenNumber<>(1));
        assertArrayEquals(firstIntegerTestList.toArray(), secondIntegerTestList.toArray());

        List<Double> firstDoubleTestList = new ArrayList<>();
        firstDoubleTestList.add(0.2);
        firstDoubleTestList.add(13.1);
        firstDoubleTestList.add(1.1);
        firstDoubleTestList.add(0.15);
        List<Double> secondDoubleTestList = new ArrayList<>();
        secondDoubleTestList.add(13.1);
        secondDoubleTestList.add(1.1);
        filter(firstDoubleTestList, new MoreThenNumber<>(0.5));
        assertArrayEquals(firstDoubleTestList.toArray(), secondDoubleTestList.toArray());
    }

    @Test
    public void testNameFilter() throws Exception {
        List<String> firstNameList = new ArrayList<>();
        firstNameList.add("Alice");
        firstNameList.add("Bob");
        firstNameList.add("Alice Jr.");
        firstNameList.add("Jon");
        List<String> secondNameList = new ArrayList<>();
        secondNameList.add("Alice");
        secondNameList.add("Alice Jr.");
        filter(firstNameList,new NameFilter("Alice"));
        assertArrayEquals(firstNameList.toArray(), secondNameList.toArray());
    }

    @Test
    public void testFindMiddleValue() throws Exception {
        List<Integer> firstIntegerTestList = new ArrayList<>();
        firstIntegerTestList.add(0);
        firstIntegerTestList.add(24);
        firstIntegerTestList.add(46);
        firstIntegerTestList.add(16);
        firstIntegerTestList.add(36);
        firstIntegerTestList.add(77);
        firstIntegerTestList.add(35);
        assertTrue(findMiddleValue(firstIntegerTestList).equals(35));
    }
}
package com.list.reverse;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseListTest {

    @Test
    public void sort_desc_a_list() {

        List<Integer> list = Arrays.asList(1,21,3,4,12,15,100, 199);
        list.stream()
                //.sorted( (a,b) -> a > b ? 1 : -1 )
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }

    @Test
    public void reverse_a_list() {

        List<Integer> list = Arrays.asList(1,21,3,4,12,15,100, 199);
         Collections.reverse(list);
                list.stream()
                .forEach(System.out::println);
    }

    @Test
    public void reverse_a_list_2() {

          IntStream.range(1, 100)
                .map(i -> 100 - i)
                .forEach(System.out::println);
    }

    @Test
    public void list_to_unique() {
        List<Integer> list = Arrays.asList(1,21,3,4,5,5,6,7,3,3,4,12,15,100, 199);
        list.stream()
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    @Test
    public void find_max() {
        List<Integer> list = Arrays.asList(-2, 1,21,3,4,5,5,6,7,3,3,4,12,15,100, 199);
        list.stream()
                .reduce( (a, b) -> a > b ? a : b)
                .ifPresent(System.out::println);
    }

    @Test
    public void find_min() {
        List<Integer> list = Arrays.asList(-2, 1,21,3,4,5,5,6,7,3,3,4,12,15,100, 199);
        list.stream()
                .reduce( (a, b) -> a > b ? b : a)
                .ifPresent(System.out::println);
    }

    @Test
    public void flatten_list() {

        List<List<Integer>> multiDim = Arrays.asList(
            Arrays.asList(1,2,3),
            Arrays.asList(4,5,6),
            Arrays.asList(7,8,9)

        );

        multiDim.stream()
                .flatMap( v -> v.stream())
                .forEach(System.out::println);
    }
}

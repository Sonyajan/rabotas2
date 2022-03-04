package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Locale.filter;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Integer> stream = intList.stream();

            intList.stream()
                    .filter(inlist -> inlist > 0)
                    .filter(inlist -> inlist % 2 == 0)
                    .sorted(Comparator.naturalOrder())
                    .forEach(System.out::println);
        }
    }

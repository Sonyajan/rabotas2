package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


public class StreamMain {
    public static void main(){
        List<Integer> intLists = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        for(int i = 0; intLists.size() < 0; i++) {
            if (intLists.size() > 0 && intLists.size() % 2 == 0) {
                System.out.print(intLists);
            }
        }

    }
}

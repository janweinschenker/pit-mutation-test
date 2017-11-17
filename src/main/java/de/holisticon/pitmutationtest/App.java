package de.holisticon.pitmutationtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    Quicksort qs = new Quicksort();
    List<Integer> integers = qs.sort(Arrays.asList(7, 4, 78, 109, 21, 19, 57));

    System.out.println("Hello World!");
  }


}

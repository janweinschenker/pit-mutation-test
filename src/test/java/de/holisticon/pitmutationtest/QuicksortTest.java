package de.holisticon.pitmutationtest;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

public class QuicksortTest {

  private Quicksort quicksort;

  @Before
  public void setUp() {
    quicksort = new Quicksort();
  }

  @Test
  public void emptyList() {
    assertEquals(true,
        quicksort
            .sort(Collections.<Integer>emptyList())
            .
                isEmpty());
  }

  @Test
  public void oneList() {
    assertEquals(false,
        quicksort
            .sort(Stream
                .of(42)
                .
                    collect(Collectors.toList()))
            .isEmpty());
  }

  @Test
  public void twoList() {
    assertEquals(Integer.valueOf(1),
        quicksort
            .sort(Stream
                .of(2, 3, 1, 8)
                .
                    collect(Collectors.toList()))
            .get(0));
  }
}

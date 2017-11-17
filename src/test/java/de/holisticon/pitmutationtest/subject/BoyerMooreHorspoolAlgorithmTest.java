package de.holisticon.pitmutationtest.subject;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import de.holisticon.pitmutationtest.subject.BoyerMooreHorspoolAlgorithm;

public class BoyerMooreHorspoolAlgorithmTest {

  private BoyerMooreHorspoolAlgorithm sut;

  @Before
  public void setUp(){
    sut = new BoyerMooreHorspoolAlgorithm();
  }

  @Test
  public void testFind(){
    char[] pattern = "sed".toCharArray();
    char[] text = ("Lorem ipsum dolor sit amet, consetetur sadipscing "
        + "elitr, sed diam nonumy eirmod tempor").toCharArray();

    int index = sut.find(pattern, text);

    assertEquals(57, index);
  }

  @Test
  public void testDoNotFind(){
    char[] pattern = "+++".toCharArray();
    char[] text = ("Lorem ipsum dolor sit amet, consetetur sadipscing "
        + "elitr, sed diam nonumy eirmod tempor").toCharArray();

    int index = sut.find(pattern, text);

    assertEquals(-1, index);
  }
}

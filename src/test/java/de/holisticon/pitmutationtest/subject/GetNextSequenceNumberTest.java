package de.holisticon.pitmutationtest.subject;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import de.holisticon.pitmutationtest.subject.GetNextSequenceNumber;

public class GetNextSequenceNumberTest {

  private GetNextSequenceNumber sut;

  @Before
  public void setUp(){
    sut = new GetNextSequenceNumber();
  }

  @Test
  public void testGetNextValue(){
    int nextValue = sut.getNextValue();
    int nextNextValue = sut.getNextValue();

    assertFalse(nextValue == nextNextValue);

    System.out.println("nextValue: "+ nextValue + " nextNextValue: " + nextNextValue);
  }
}

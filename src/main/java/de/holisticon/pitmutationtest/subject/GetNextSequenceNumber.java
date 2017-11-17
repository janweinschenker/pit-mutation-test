package de.holisticon.pitmutationtest.subject;

public class GetNextSequenceNumber {

  private int val = 0;

  public int getNextValue() {
    increment();
    return val;
  }

  private void increment() {
    val++;
  }
}

package de.holisticon.pitmutationtest;

import org.junit.Before;
import org.junit.Test;

import de.holisticon.pitmutationtest.App;

/**
 * Unit test for simple App.
 */
public class AppTest {
  private App app;

  @Before
  public void setUp() {
    app = new App();
  }

  @Test
  public void testApp() {
    app.toString();

    App.main(null);
  }
}

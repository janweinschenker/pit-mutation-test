package de.holisticon.pitmutationtest;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.CommandLineRunner;

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

    CommandLineRunner run = app.run();
    assertNotNull(run);
  }
}

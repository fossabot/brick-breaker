/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package brick.breaker;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import processing.core.PApplet;

public class AppTest {

  @Test
  public void testAppIsPApplet() {
    App app = new App();
    assertTrue(app instanceof PApplet);
  }
}

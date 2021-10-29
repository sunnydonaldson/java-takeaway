import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class AppTest {
  @Test public void testHello(){
    App app = new App();
    assertEquals(app.hello(), "hello");
  }
}

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DishTest {
  //Question for anyone reviewing, I don't want to make the price and name attributes public so they can only be accessed
  //through the getters and setters I provide.  But how do I test the constructor, without relying on these methods,
  //(which I haven't written yet)?
  @Test public void testTitle(){
    Dish dish = new Dish("Muffin",12.99);
    assertEquals("Muffin",dish.title());
  }

  @Test public void testPrice() {
    Dish dish = new Dish("Scrambled Egg", 3.44);
    assertEquals(3.44, dish.price());
  }

  @Test public void testConstructor(){
    Dish dish = new Dish("Halloumi", 12.80);
    assertEquals("Halloumi",dish.title());
    assertEquals(12.80, dish.price());
  }

}

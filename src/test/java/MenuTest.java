import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class MenuTest {
  @Test public void testGetDishes(){
    Menu menu = new Menu();
    String[] DISHES = {"Ham and Eggs", "Sausage and Bacon", "Curry"};
    assertEquals(DISHES, menu.getMenu());
  }

}

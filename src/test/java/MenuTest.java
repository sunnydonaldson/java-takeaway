import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
public class MenuTest {
  @Test public void testGetDishes(){
    Menu menu = new Menu();
    ArrayList<String>  DISHES = new ArrayList<>(List.of("Ham and Eggs", "Sausage and Bacon", "Curry"));
    assertEquals(DISHES, menu.getMenu());
  }

  @Test public void testAddDish(){
    Menu menu = new Menu();
    ArrayList<String>  DISHES = new ArrayList<>(List.of("Ham and Eggs", "Sausage and Bacon", "Curry", "Cake"));
    menu.addDish("Cake");
    assertEquals(DISHES, menu.getMenu());

  }

}

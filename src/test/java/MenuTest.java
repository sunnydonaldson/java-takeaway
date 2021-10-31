import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MenuTest {
  Dish salad = mock(Dish.class);
  Dish ham = mock(Dish.class);
  Dish curry = mock(Dish.class);
  MenuTest() {
    stubHelper(salad, "Salad", 6.00);
    stubHelper(ham, "Ham and Eggs", 12.80);
    stubHelper(curry, "Curry", 14.00);
  }


  private void stubHelper(Dish dish_mock, String title, double price){
    when(dish_mock.title()).thenReturn(title);
    when(dish_mock.price()).thenReturn(price);
  }

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

  @Test public void testMock(){
   Menu menu = new Menu();

   Dish result = menu.testMock(salad);
    System.out.println(salad.title());
  }

}

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MenuTest {
  Dish salad = mock(Dish.class);
  Dish ham = mock(Dish.class);
  Dish curry = mock(Dish.class);
  Dish cake = mock(Dish.class);
  ArrayList<Dish> DISHES = new ArrayList<>(List.of(salad, ham, curry));

  MenuTest() {
    dishStubHelper(salad, "Salad", 6.00);
    dishStubHelper(ham, "Ham and Eggs", 12.80);
    dishStubHelper(curry, "Curry", 14.00);
    dishStubHelper(cake, "Chocolate Cake", 4.50);
  }


  private void dishStubHelper(Dish dish_mock, String title, double price){
    when(dish_mock.title()).thenReturn(title);
    when(dish_mock.price()).thenReturn(price);
  }

  @Test public void testConstructorWithListArg(){
    Menu menu = new Menu(DISHES);
    assertEquals(DISHES, menu.getMenu());
  }

  @Test public void testConstructorWithNoArg(){
    Menu menu = new Menu();
  }


  //basically a duplicate of testConstructorWithListArg
  @Test public void testGetDishesWithDishes(){
    Menu menu = new Menu(DISHES);
    assertEquals(DISHES, menu.getMenu());
  }

  @Test public void testGetDishesNoDishes(){
    Menu menu = new Menu();
    assertEquals(null, menu.getMenu());
  }

  @Test public void testAddDish(){
    Menu menu = new Menu(DISHES);
    menu.addDish(cake);
    assertEquals(DISHES, menu.getMenu());

  }


}

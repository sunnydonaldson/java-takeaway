import java.util.ArrayList;
import java.util.List;
public class Menu {
  ArrayList<String> DISHES = new ArrayList<>(List.of("Ham and Eggs","Sausage and Bacon", "Curry"));


  public ArrayList getMenu(){
    return DISHES;
  }

  public void addDish(String dish){
    DISHES.add(dish);
  }
  public Dish testMock(Dish dish){
    return dish;
  }
}

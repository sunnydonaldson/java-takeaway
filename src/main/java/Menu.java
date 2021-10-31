import java.util.ArrayList;
import java.util.List;
public class Menu {
  ArrayList<Dish> DISHES;

  Menu(){
    DISHES = new ArrayList<>();
  }
  Menu(ArrayList<Dish> dishes){
    DISHES = dishes;
  }


  public ArrayList getMenu(){
    return DISHES;
  }

  public void addDish(Dish dish){
    DISHES.add(dish);
  }

}

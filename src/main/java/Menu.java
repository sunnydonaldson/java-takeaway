import java.util.ArrayList;
import java.util.List;
public class Menu {
  ArrayList<Dish> DISHES;

  Menu(){
    System.out.println("Menu initialized with no items");
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

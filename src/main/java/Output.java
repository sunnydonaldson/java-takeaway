import java.util.ArrayList;
public class Output {
  public static void display(ArrayList<Dish> dishes){
    if(dishes.size() > 0) {
      for (Dish i : dishes) {
       display(i);
      }
    }else{
      System.out.println("Sorry, the list of dishes you passed was empty");
    }

  }
  public static void display(Dish dish){
    System.out.println("title: " + dish.title() + ", price: £"+dish.price());
  }


}

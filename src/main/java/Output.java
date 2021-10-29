public class Output {
  public static void display(String[] arr){
    for(String i: arr){
      System.out.println(i);
    }

  }
  public static void display(Dish dish){
    System.out.println("title: " + dish.title() + ", price: £"+dish.price());
  }


}

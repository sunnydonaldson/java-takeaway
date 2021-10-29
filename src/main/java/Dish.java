public class Dish {
  String titleAttr;
  double priceAttr;
  Dish(String input_title, double input_price){
    titleAttr = input_title;
    priceAttr = input_price;
  }
  public String title(){
    return titleAttr;
  }

  public double price(){
    return priceAttr;
  }

}

import java.util.Scanner;
public class App {
  public static void main(String[] args){
    startTakeaway();

  }

  public static void startTakeaway(){
   Menu menu = createSampleMenu();
   userInterface(menu);

  }

  public static Menu createSampleMenu(){
    Menu menu = new Menu();
    Dish curry = new Dish("Curry", 12.99);
    menu.addDish(curry);
    menu.addDish(new Dish("Cake", 4.50));
    menu.addDish(new Dish("Sheperds Pie",7.80));
    menu.addDish(new Dish("Chips", 3.70));
    return menu;


  }

  public static void userInterface(Menu menu){
    Scanner scanner = new Scanner(System.in);
    char choice;
    while(true){
      System.out.println("[1]=view dishes,\n[q]=quit");
      System.out.println("Please choose an option:");
      String user_input = scanner.nextLine();

      if(user_input.isEmpty()){
        System.out.println("that wasn't a valid input...");
        continue;
      }else{
        choice = user_input.charAt(0);

      }


      if(choice == '1'){
        Output.display(menu.getMenu());
      }else if (choice == 'q' || choice == 'Q'){
        break;
      }

    }

    scanner.close();
    System.out.println("goodbye!");
  }

}

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class OrderTest {
  Dish salad = mock(Dish.class);

  OrderTest(){
    when(salad.title()).thenReturn("Salad");
    when(salad.price()).thenReturn(6.60);
  }
//  @Test public void testOrderConstructorWithNoArgs(){
//    Order order = new Order();
//    assertTrue(Order.items().isEmpty());
//  }
//
//  @Test public void testOrderItems(){
//    Order order = new Order();
//    Order.add();
//
//  }

}

//StreamEx
import java.util.*;
class StreamEx{
  public static void main(String[] args){
    List<Integer> numbers = new ArrayList<Integer>();
    numbers.add(10);
    numbers.add(90); 
    numbers.add(54);
    numbers.stream().filter(n -> n > 50).forEach(System.out::println);
  }
}
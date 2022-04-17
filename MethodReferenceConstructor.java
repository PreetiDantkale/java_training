@FunctionalInterface
interface Hello{
  Data printHelloo(String s);
}
class Data{
  Data(String s){
    System.out.println(s);
  }
}
public class MethodReferenceConstructor {  
  
  public static void main(String[] args) {

    Hello h = Data::new;
    h.printHelloo("Hello");
  }
}  
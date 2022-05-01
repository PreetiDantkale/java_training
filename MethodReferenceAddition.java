@FunctionalInterface
interface Sum{  
  void show();
}
public class MethodReferenceAddition {  
  public static void add(){  
    System.out.println(1+1);  
  }

  public void diff(){
    System.out.println(11-1);  
  }
  public static void main(String[] args) {
    //reference to static method
    Sum s1 = MethodReferenceAddition::add;  
    s1.show();

    //reference to instance method
    MethodReferenceAddition ma = new MethodReferenceAddition();
    Sum s2 = ma::diff;
    s2.show();
  }
}  
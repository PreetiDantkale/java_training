
interface TestInterface{

  void sayHello();
  default void sayWelcome(){
    System.out.println("Welcome");
  }
  String toString();
}
class FunctionalInterfaceDemo implements TestInterface{

  public void sayHello(){
    System.out.println("Hello");
  }

  public static void main(String[] args){
    FunctionalInterfaceDemo fid = new FunctionalInterfaceDemo();
    fid.sayHello();
    fid.sayWelcome();
  }
}
interface DefaultInter{

  default void hello(){
    System.out.println("Hello");
  }
}
class DefaultMethod implements DefaultInter{
  
  public static void main(String[] args){
    DefaultMethod dm = new DefaultMethod();
    dm.hello();
  }
}
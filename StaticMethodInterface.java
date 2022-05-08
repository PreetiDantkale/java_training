
interface Data{

  default void hello(){
    System.out.println("Hello");
  }

  void welcome();

  static void goodbye(){
    System.out.println("Good Bye");
  }

  default void changetohello(){
    System.out.println("Hi");
  }
}

class StaticMethodInterface implements Data{
  public void welcome(){
    System.out.println("Welcome");
  }

  public void changetohello(){
    System.out.println("To Hello");
  }

  public static void main(String[] args){
    StaticMethodInterface smi = new StaticMethodInterface();
    smi.hello();
    smi.welcome();
    Data.goodbye();
    smi.changetohello();

  }
}
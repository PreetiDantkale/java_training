import java.util.Optional;

class OptionalClassDemo{

  public static void main(String[] args){
    String str[] = new String[10];

    //Error - NullPointerException
    // String upper = str[5].toUpperCase();
    // System.out.println(upper);

    str[1] = "hello";
    Optional<String> valuePresent = Optional.ofNullable(str[1]);
    if(valuePresent.isPresent()){
      String upper = str[1].toUpperCase();
      System.out.println(upper);
    }
    else
    {
      System.out.println("Value not present");
    }

    Optional emp = Optional.empty();
    System.out.println(emp);
    
    Optional<String> data = Optional.of(str[1]);
    System.out.println("orElse:"+data.orElse("Null"));
    System.out.println("orElse:"+emp.orElse("Null"));
  }
}
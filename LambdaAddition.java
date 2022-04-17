//lambda expression
//interface
interface Addition{
  int sum(int a, int b);
}

class LambdaAddition{

  public static void main(String[] args) {
    int result;
    //Lambda Expression 
    Addition add = (a,b) -> {
      return (a+b);
    };
    result = add.sum(10,20);
    System.out.println("Sum="+result);
  }
}

class ThrowStatement {
  
  public static void main(String[] args){

    int num = -1;

    if(num < 0){
      throw new ArithmeticException("Invalid number");
    }
    else{
      System.out.println("Valid num");
    }
  }
  
}
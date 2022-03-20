
class MayThrowException{

  public static void main(String[] args){
    int i=10, j=0, res;
    try{
      res = i/j;
    }
    catch(Exception e){
      System.out.println(i/(j*10));
    }
    System.out.println("EOC");
  }
}
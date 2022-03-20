
class MultipleCatch{
  public static void main(String[] args){
    try {
      int a[] = new int[5];
      a[10] = 20/10;
    }
    // catch(Exception e){
    //   System.out.println(e);
    // }(ordering must be from specific to generic)
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }
    catch(ArithmeticException e){
      System.out.println(e);
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
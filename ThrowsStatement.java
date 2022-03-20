import java.io.IOException;
class ThrowsStatement{

  void testfile() throws IOException{
    throw new IOException("IO Error");
    // System.out.println("In testfile");

  }
  public static void main(String[] args) throws IOException{
    ThrowsStatement ts = new ThrowsStatement();
    // try{
    //   ts.testfile();
    // }
    // catch(Exception e){
    //   System.out.println(e);
    // }
    ts.testfile();
    
  }
}
import java.util.*;
class TestException{
	public static void main(String[] args){
		try{
			int a = 10/0;
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Out of block");
	}
}
//ForEach
import java.util.*;  
class ForEachEx {
	public static void main(String[] args){
		List<String> letters = new ArrayList<String>();
    letters.add("a");
    letters.add("b"); 
    letters.add("c");
    letters.forEach(l -> System.out.println(l));
	}
}
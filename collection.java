//collection framework
import java.util.*;
class CollectionFmwk{
	
	public static void main(String[] args){
    //ArrayList collection
    ArrayList<Integer> al = new ArrayList<Integer>();

    //for loop
    for(int i=1; i<=5; i++)
      al.add(i);

    System.out.println(al);

    //removes element at 4th index
    al.remove(4);
    System.out.println(al);

    //LinkedList collection
    LinkedList<Integer> ll = new LinkedList<Integer>();

    ll.add(0, 2022);
    System.out.println(ll);

    //Vector collection
    Vector<String> vt = new Vector<String>();
    vt.add("Hello");
    System.out.println(vt);

    //Stack
    Stack<String> st = new Stack<String>();
    st.push("March");
    st.push("2022");
    st.push("13");
    System.out.println(st);
    st.pop();
    System.out.println(st);

	}
}
import java.util.*;
public class TreesSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     TreeSet<String> ts=new TreeSet<String>();
     ts.add("Geeks");
     ts.add("For");
     ts.add("Geeks");
     ts.add("Is");
     ts.add("Very helpful");
     Iterator<String>itr=ts.iterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     }
	}

}

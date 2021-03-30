import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment3Q3 {
    public static List<Integer> traverseReverse(ArrayList<Integer> a){
    	a.add(21);
    	a.add(22);
    	a.add(23);
    	a.add(24);
    	a.add(25);
    	ListIterator<Integer> a1=a.listIterator(a.size());
    	while(a1.hasPrevious()) {
    		System.out.println(a1.previous());
    	}
    	return a;
    }
    public static void main(String[] args) {
    	Assignment3Q3 a= new Assignment3Q3();
    	ArrayList<Integer> b=new ArrayList<>();
    	List<Integer> d=a.traverseReverse(b);
    	System.out.println("The original list order is "+d);
    	
    }
}


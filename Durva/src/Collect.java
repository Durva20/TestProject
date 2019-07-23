import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a=new ArrayList();
a.add(22);
a.add(90);
a.add(12);
a.add(89);


Collections.sort(a);
System.out.println(a);


Collections.swap(a, 0, 3);
System.out.println(a);


	}
}

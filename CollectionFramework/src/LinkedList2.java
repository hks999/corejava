import java.util.Iterator;
import java.util.LinkedList;
public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> In = new LinkedList<String>();
        In.add("ravi");
        In.add("Partha");
        In.add("Manoj");
        In.add("Shipra");
        Iterator <String> Ia = In.iterator();
        while (Ia.hasNext()){
            System.out.println(Ia.next());
        }

    }
}

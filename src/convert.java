import java.util.*;
public class convert {
    public static void main(String[] args){
        LinkedList<String> a1 = new LinkedList<String>();
        a1.add("Pratik");
        a1.add("shrikant");
        a1.add("Ranshewre");

        Iterator itr = a1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}

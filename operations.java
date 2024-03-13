import java.util.*;

public class operatons{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);

        System.out.println(list);

        int ele = list.get(2);
        list.set(2,5);
        list.remove(4);

        System.out.println(ele);
        System.out.println(list);
        System.out.println(list.contains(3));

    }
}
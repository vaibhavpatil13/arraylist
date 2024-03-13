import java.util.*;

public class swap{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);

        int ind1 =1 , ind2 =3 ; 
        printarr(list,ind1,ind2);

        System.out.print(list+" ");


    }
    public static void printarr(ArrayList<Integer> list, int ind1, int ind2){
        int temp = list.get(ind1);
        list.set(ind1 , list.get(ind2));
        list.set(ind2 , temp);
    }
}
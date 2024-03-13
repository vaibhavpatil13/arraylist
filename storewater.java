import java.util.*;

public class storewater{
    public static void main(String args[]){
        ArrayList<Integer> height =  new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.print(total(height));
    }
    public static int total(ArrayList<Integer> height){
        int max = 0 ;

        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht = Math.min(height.get(i),height.get(j));
                int wd = j-i;

                int store = ht*wd;

                max = Math.max(max,store);
            }
        }

        return max;
    }
}
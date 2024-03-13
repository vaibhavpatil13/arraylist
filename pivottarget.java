import java.util.*;

public class pivottarget{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

         list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        int target = 15;
        System.out.print(find(list,target));
    }
    public static boolean find(ArrayList<Integer> list, int target){
        //breaking point
        int bp = -1;
        int n=list.size();

        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1;   //smallest
        int rp = bp;    //largest
        //case 1
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }

            //case 2
            if(list.get(lp)+list.get(rp)<target){
                lp = (lp+1)%n;
            }else{
                rp = (n+rp-1)%n;
            }
        }

        return false;
    }
}
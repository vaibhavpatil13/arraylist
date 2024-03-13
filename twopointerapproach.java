import java.util.*;

public class twopointerapproach{
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
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
        int max=0;
        //two pointers
        int lp = 0;
        int rp = height.size()-1;

        while(lp<rp){
            int ht = Math.min(height.get(lp),height.get(rp));  //height
            int wd = rp - lp ;   //width
                //total water stores
            int curr= ht*wd;
            max = Math.max(max,curr);    //maximum water stored

        //conditions
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }

        return max;
    }
}
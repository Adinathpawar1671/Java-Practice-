public class Recursion10{
    public static int friendsNpairs(int num){
            if(num==1 || num==2){
                return num;
            }
            //sinle
            // int fnm1 = friendsNpairs(num-1);
            // //pairs
            // int fnm2 = friendsNpairs(num-2);
            // int pairways = (num-1)*fnm2;

            // int totalpairs = fnm1 + pairways;
            // return totalpairs;
            return friendsNpairs(num-1)+friendsNpairs(num-1)*friendsNpairs(num-2)
    }    
public static void main(String[] args){
        System.out.println(friendsNpairs(5));
    }
}
public class StringsShortestPath{
    public static float Shortest_path(String path){
        int x=0; 
        int y=0;
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i)=='S'){
                y--;
                System.out.println("y-- "+y);
            }
            else if(path.charAt(i)=='N'){
                y++;
                System.out.println("y++ "+y);

            }else if(path.charAt(i)=='W'){
                x--;
                System.out.println("x-- "+x);

            }else{
                x++;
                System.out.println("x++ "+x);

            }
        }
        int xsum = x*x;
        int ysum = y*y;

        return (float)Math.sqrt(xsum+ysum);
    }
    public static void main(String agrgs[]){
        String path ="SWWWNNENW";
        System.out.println(Shortest_path(path));
    }
    
}
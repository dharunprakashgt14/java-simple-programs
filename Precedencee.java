public class Precedencee{
    public static void main(String[] args){
        int x=2,y=4,z=6;
        int result =x+y*z>20?x*y+z:x+y<z?y:z;
        System.out.println(result);
    }
}
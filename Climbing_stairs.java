/*
   Name : Parasaran M
   Question : Number of ways to Climb the stairs
   Input: n = 2
   Output: 2
   Explanation: There are two ways to climb to the top.
   1. 1 step + 1 step
   2. 2 steps
   Input: n = 3
   Output: 3
   Explanation: There are three ways to climb to the top.
   1. 1 step + 1 step + 1 step
   2. 1 step + 2 steps
   3. 2 steps + 1 step 
 */
import java.util.*;
public class Climbing_stairs {
    public static int stairs(int n){
       int a = 1,b = 0,ways=0;
       if(n == 0){
           return 0;
       }
       else if(n == 1){
           return 1;
       }
       for (int i = 1; i <=n; i++) {
           ways = a+b;
           b = a;
           a = ways;
       }
       return ways;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        System.out.println("Numbers of Ways to Climb the stairs = "+stairs(n));
    }
}

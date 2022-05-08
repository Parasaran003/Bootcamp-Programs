/*
   Name : Parasaran M
   Question : Flower Bed
   Input: flowerbed = [1,0,0,0,1], n = 1
   Output: true

   Input: flowerbed = [1,0,0,0,1], n = 2
   Output: false 
 */
import java.util.*;
public class Flower_Bed {
    public static void flowers(int arr[],int n,int m){
      int count = 0;
      for (int i = 1; i < arr.length; i++) {
          if (arr[i] == 0 && arr[i+1] == 0 && arr[i-1] == 0){
              count++;
          }
      }
      if (count>=m) {
          System.out.println("true");
      }
      else{
          System.out.println("false");
      }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m;
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        m = in.nextInt();
        flowers(arr, n, m);
    }
}

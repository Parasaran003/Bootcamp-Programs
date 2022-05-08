/*
  Name : Parasaran M
  Question : Jewels and Stones Program
  Input: jewels = "aA", stones = "aAAbbbb"
  Output: 3
  Input: jewels = "z", stones = "ZZ"
  Output: 0 
 */
import java.util.*;
public class Jewels_and_stone {
    public static void common_char(String str1,String str2){
      int count = 0;
      for (int i = 0; i < str1.length(); i++) {
          char ch1 = str1.charAt(i);
          for (int j = 0; j < str2.length(); j++) {
              char ch2 = str2.charAt(j);
              if (ch1 == ch2) {
                count++;
              }
          }
      }
      System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1,str2;
        str1 = in.next();
        str2 = in.next();
        common_char(str1, str2);
    }
}

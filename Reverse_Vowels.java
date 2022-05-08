/*
   Name: Parasaran M
   Question : Reverse Vowels Characters in the String
   Input: Hello
          Hari Hari Hari
   Output:
          Holle
          Hira Hira Hira

 */
import java.util.*;
public class Reverse_Vowels{
    public static void vowels(String str){
       String str1 = "";
       for (int i = str.length()-1; i>=0; i--) {
           char ch = str.charAt(i);
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
             str1 = str1 + ch;
           }
       }
       String ans = "";
       int k=0;
       for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
          ans = ans + str1.charAt(k++);
        } 
        else{
            ans = ans + ch;
        }
       }
       System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        str = in.nextLine();
        vowels(str);
    }
}
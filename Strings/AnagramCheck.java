import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck{
  public static void main(String[] args){
    String s1 = "listen";
    String s2 = "silent";

    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();

    if(s1.length() != s2.length()){
      System.out.println("Not Anagram");
      return;
    }
    char[] a1 = s1.tocharArray();
    char[] a2 = s2.tocharArray();

    Arrays.sort(a1);
    Arrays.sort(a2);

    if(Arrays.equals(a1 , a2){
      System.out.println("Anagram");
    }
    else{
      System.out.println("Not Anagram");
    }
  }
}

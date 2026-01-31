public class PalindromeString {
  public static void main(String[] args){
    String str = "madam";

    String original = str;
    String reverse = " ";

    for(int i = str.length-1; i >= 0; i--){
      reverse = reverse + str.charAt(i);
    }

    if(original.equals(reverse)){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not Palindrome");
    }
  }
}

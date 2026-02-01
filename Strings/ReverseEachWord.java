public class ReverseEachWord{
  public static void main(String[] args){
    String str = "hello world java";
    String result = "";

    String[] words = str.split(" ");
    

    for(String word : words){
      String reverse = "";

      for(int i = word.length() - 1; i >= 0; i--){
        rev = rev + word.charAt(i);
      }

      result = result + reverse + " ";
    }
    System.out.println(result.trim());
  }
}

public class RemoveDuplicateChars {
  public static void main(String[] args){
    String str = "programing";

    String result = "";

    for(int i = 0; i < str.length(); i++){
      char ch = str.charAt(i);
      
      if(result.index(ch) == -1{
        result = result + ch;
        
      }
      
    }
    System.out.println(result);
  }
}

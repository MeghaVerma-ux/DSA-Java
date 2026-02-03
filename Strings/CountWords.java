public class CountWords{
  public static void main(String[] args){
    String str = " Hello World Java ";

    str = str.trim();

    if(str.isEmpty()){
      System.out.println("Word count: 0");
      return;
    }

    String[] words = str.split(" ");
    System.out.println("Word count: " + words.length);
  }
}

public class MoveZerosToStart{
  public static void main(String[] args){
    int[] arr = {1, 0, 3, 0, 5};
    int n = arr.length;

    int[] result = new int[n];
    int index = 0;


    for(int i = 0; i < n; i++){
      if(arr[i] == 0){
        result[index++] = 0;
      }
    }

    for(int i = 0; i < n; i++){
      if(arr[i] != 0){
        result[index++] = arr[i];
      }
    }

    for(int x : result){
      System.out.println(x + " ");
    }
    
  }
}

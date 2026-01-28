public class RemoveDuplicates{
  public static void main(String[] args){
    int[] arr = {1, 1, 2, 2, 3, 4, 4};
    int n = arr.length;

    int[] result = new int[n];
    int index = 0;

    result[index++] = arr[0];

    for(int i = 1; i < n; i++){
      if(arr[i] != arr[i-1]){
        result[index++] = arr[i];
      }
    }

    for(int i = 0; i < index; i++){
      System.out.println(result[i] + " ");
    }
  }
}

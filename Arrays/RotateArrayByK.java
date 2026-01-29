public class RotateArrayByK {
  public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 5};
    int n = arr.length;
    int k = 2;

    k = k % n;

    int[] result = new int[n];
    int index = 0;

    for(int i = k; i < n; i++){
      result[index++] = arr[i];
    }

    for(int i = 0; i < k; i++){
      result[index++] = arr[i];
    }

    for(int x : result){
      System.out.println(x + " ");
    }
  }
}

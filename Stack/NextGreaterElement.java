import java.util.Scanner;
public class NextGreaterElement{
  public static int[] nextGreater(int[] arr){

    int n = arr.length;
    int[] result = new int[n];

    Stack<Integer> stack = new Stack<>();

    for(int i = n - 1; i >= 0; i--){


      while(!stack.isEmpty() && stack.peek <= arr[i]){
        stack.pop();
      }

      if(stack.isEmpty()){
        return false;
      }

      else{
        result[i] = stack.peek();
      }

      stack.push(arr[i]);
    }

    return result;
  }

  public static void main(String[] args){
    
    int[] arr = {2, 1, 2, 4, 3};
    int[] res = nextGreater(arr);

    System.out.println(Arrays.toString(res));
  }
}

public class SecondLargestElement{
  public static void main(String[] args){
    int[] arr = {10, 5, 20, 8};

    int largest = arr[0];

    for(int i = 1; i < arr.length; i++){
      if(arr[i] > largest){
        largest = arr[i];        
      }
    }

    int secondLargest = Integer.MIN_VALUE;

    for(int i = 0; i < arr.length; i++){
      if(arr[i] != largest && arr[i] > secondLargest){
        secondLargest = arr[i];
        
      }
      
    }

    System.out.println("Second largest element: " + secondLargest);
  }
}

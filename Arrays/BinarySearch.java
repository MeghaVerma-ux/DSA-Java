public class BinarySearch{
  public static void main(String[] args){
    int[] arr = [2, 5, 8, 10, 15];
    int target = 10;

    int left = 0;
    int right = arr.length-1;

    while(left <= right){
      int mid = (left + right)/2;

      if(arr[mid] == target){
        System.out.println("Array found at index: ", mid);
        return;
      }
      else if(arr[mid] < target){
        left = mid + 1;
      } 
      else{
        right = mid - 1;
      }
        
      
      
    }
    System.out.println("Element not found");
  }
}

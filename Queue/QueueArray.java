public class QueueArray {

  int[] arr;
  int rear;
  int front;
  int capacity;
  int size;

  public QueueArray(int capacity) {
    this.capacity = capacity;

    arr = new int[capacity];
    rear = -1;
    front = 0;
    size = 0;
  }

  public void enqueue(int x) {

    if(size == capacity) return;

    rear = rear + 1;
    arr[rear] = x;
    size++;
  }

  public int dequeue() {

    if(size == 0) return -1;

    int val = arr[front];
    front = front + 1;
    size--;

    return val;
  }

  public int peek() {

    if(size == 0) return -1;

    return arr[front];
  }
}

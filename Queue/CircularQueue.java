public class CircularQueue {

  int[] arr;
  int rear;
  int front;
  int size;
  int capacity;

  public CircularQueue(int capacity) {

    this.capacity = capacity;
    
    arr = new int[capacity];

    front = 0;
    rear = -1;
    size = 0;
  }

  public void enqueue(int x) {

    if(size == capacity) return;

    rear = (rear + 1) % capacity;
    arr[rear] = x;
    size++;
  }

  public int dequeue() {

    if(size == 0) return -1;

    int val = arr[front];
    front = (front + 1) % capacity;
    size--;

    return val;
  }

  public int peek() {

    if(size == 0) return -1;

    return arr[front];
  }
}

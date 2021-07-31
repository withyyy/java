package Model;

/**
 * 环形链表（数组模拟）
 */
public class ArrayQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public ArrayQueue(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = 0;     //指向队列头
        rear = 0;  //指向队列尾部
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public void add(int n) {
        if (!this.isFull()) {
            arr[rear] = n;
            rear = (rear + 1) % maxSize;

        }
    }

    public int get() throws Exception {
        if (!isEmpty()) {
            int tem = front;
            front = (front + 1) % maxSize;
            return arr[tem];
        } else {
            throw new Exception("裂开了,队列是空的");
        }
    }

    public void list() {
        if (!isEmpty()) {
            for (int i = front; i < front + length(); i++) {
                System.out.println(arr[i % maxSize]);
            }
        } else {
            System.out.println("队列是空的");
        }
    }


    public int head() throws Exception {
        if (!isEmpty()) {
            return arr[front];
        } else {
            throw new Exception("队列为空！");
        }
    }

    public int length() {
        return (rear - front + maxSize) % maxSize;
    }
}
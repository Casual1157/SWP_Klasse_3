package queue;

public class ArrayQueue {

	private static int front;
	private static int rear;
	private static int capacity;
	private static int[] queue;
	
	public ArrayQueue(int size) {
		front = 0;
		rear = 0;
		capacity = size;
		queue = new int[size];
	}
	
	/**
	 * Puts an item into the queue
	 * @param item
	 */
	public static void enqueue(int item) {
		if(rear == capacity) {
			System.out.println("Queue ist voll.");
		}else {
			queue[rear] = item;
			rear++;
		}
	}
	/**
	 * Removes an item with a certain ID from the queue
	 * @param itemId
	 */
	public static void dequeue(int itemId) {
		if(rear == front) {
			System.out.println("Queue ist leer");
		}else {
			queue[itemId] = 0;
			rear--;
		}
	}
	
	/**
	 * Returns the first element in the queue
	 * @return
	 */
	public static int front() {
		int firstElement = 0;
		if(rear == front) {
			System.out.println("Queue ist leer");
		}else {
			firstElement = queue[front];
			
		}
		return firstElement;
	}
	
	/**
	 * Prints every item in the queue
	 */
	public static void display() {
		for(int i = 0; i <= front; i++) {
			System.out.println(queue[i]);
		}
	}
}

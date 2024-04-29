package queue;

public class ArrayQueueTest {
	
	public static void main(String[] args) {
		
		ArrayQueue queue = new ArrayQueue(10);

		for(int i = 0; i < 10; i++) {
			ArrayQueue.enqueue(i);
		}
		

		ArrayQueue.display();
		//queue.dequeue(1);
		
	}
}

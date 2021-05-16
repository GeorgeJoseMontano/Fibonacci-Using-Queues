import java.util.Scanner;

public class fibonacciQueue {
	public static void main(String args[]) {
		
		OurListQueue queue = new OurListQueue();
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		input.close();
		
		queue.enqueue(0);
		queue.enqueue(1);
		
		for(int i = 0; i < n; i++) {
			int a = queue.dequeue();
			System.out.print(a + " ");
			int b = queue.peek();
			queue.enqueue(a + b);
		}
		System.out.println();
	}

}


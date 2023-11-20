import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue<String> queue = new Queue<>();
	        Scanner scanner = new Scanner(System.in);
	        String input;
	        boolean running = true;

	        System.out.println("VegeBurger Palace Queue System");
	        System.out.println("Enter commands: 'enqueue [name]', 'dequeue', 'print', or 'exit'");

	        while (running) {
	            System.out.print("Command: ");
	            input = scanner.nextLine();
	            String[] parts = input.split(" ");

	            switch (parts[0].toLowerCase()) {
	                case "enqueue":
	                    if (parts.length < 2) {
	                        System.out.println("Please provide a name to enqueue.");
	                    } else {
	                        queue.enqueue(parts[1]);
	                        System.out.println(parts[1] + " added to the queue.");
	                    }
	                    break;

	                case "dequeue":
	                    if (!queue.isEmpty()) {
	                        System.out.println(queue.dequeue() + " has been served.");
	                    } else {
	                        System.out.println("The queue is empty.");
	                    }
	                    break;

	                case "print":
	                    queue.printQueue();
	                    break;

	                case "exit":
	                    running = false;
	                    break;

	                default:
	                    System.out.println("Invalid command. Try again.");
	                    break;
	            }
	        }

	        scanner.close();
	        System.out.println("System exited.");
	    }
	
	}



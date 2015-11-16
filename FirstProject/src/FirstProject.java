import java.util.*;
public class FirstProject {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.println("Type a number from 1-100: ");
		int number = 0;
		checkMismatch(console, number);	
	}
	
	public static void checkMismatch(Scanner console, int number){
		try{
			number = Integer.parseInt(console.next());
			if(number > 100 || number < 1){
				System.out.println("Please input a number between 1 and 100: ");
				checkMismatch(console, number);
			} else {
				factor(number);
				quit(console, number);
			}
		} catch(NumberFormatException e){
			System.out.println("Only integer values allowed. Please input a number between 1 and 100: ");
			checkMismatch(console, number);
		}
	}
	
	public static void factor(int number){
		for (int i = 1; i < number; i++){
			if(number % i == 0){
				System.out.print(i + " ");
			}
		}
		System.out.print(number);
	}
	
	public static int gcd(int number, int number2){
		int biggest = number;
		int smallest = number2;
		if(number2>number){
			biggest = number2; smallest = number; 
		}
		if(smallest==0){
			return biggest; 
		} else {
			return gcd(smallest, biggest%smallest);
		}
	}
	
	public static void quit(Scanner console, int number){
		System.out.print("\nQuit? ");
		String quit = console.next();
		if(quit.substring(0,1).toLowerCase().equals("q") || quit.substring(0,1).toLowerCase().equals("y")){
			number = 0;
		} else if (quit.substring(0,1).toLowerCase().equals("n")){ 
			System.out.println("Type a number from 1-100: ");
			checkMismatch(console, number); 
		}
	}
}
import java.util.*;
public class FirstProject {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.println("Type a number from 1-100: ");
		int number = console.nextInt();
		checkMismatch(console, number);
		
	}
	
	public static void checkMismatch(Scanner console, int number){
		try{
			if(number > 100 || number < 1){
				System.out.println("Please input a number between 1 and 100: ");
				number = console.nextInt();
				factor(console, number);
			} else {
				factor(console, number);
			}
		} catch(InputMismatchException e){
			System.out.println("Only integer values allowed.");
			checkMismatch(console, number);
		}
	}
	
	public static void factor(Scanner console, int number){
		for (int i = 1; i < number; i++){
			if(number % i == 0){
				System.out.print(i + " ");
			}
		}
		System.out.print(number);
		quit(console, number);
	}
	
	public static void quit(Scanner console, int number){
		System.out.print("\nQuit? ");
		String quit = console.next();
		if(quit.substring(0,1).toLowerCase().equals("q") || quit.substring(0,1).toLowerCase().equals("y")){
			
		} else if (quit.substring(0,1).toLowerCase().equals("n")){ 
			System.out.println("Type a number from 1-100: ");
			number = console.nextInt();
			checkMismatch(console, number); 
		}
	}
}

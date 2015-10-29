import java.util.*;
public class FirstProject {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		factor(console);
		
	}
	
	public static void factor(Scanner console){
		System.out.println("Type a number from 1-100: ");
		int number;
		try{
			number = console.nextInt();
			if(number > 100){
				System.out.println("Please input a number between 1 and 100 ");
				number = console.nextInt();
			} else{
				for (int i = 1; i < number; i++){
					if(number % i == 0){
						System.out.print(i + " ");
					}
				}
			}
			System.out.print(number);
			quit(number, console);
		} catch(InputMismatchException e){
			System.out.println("Only integer values allowed");
			
		}
	}
	
	public static void quit(int number, Scanner console){
		System.out.print("\nQuit? ");
		String quit = console.next();
		if(quit.toLowerCase().equals("quit") || quit.toLowerCase().equals("yes") || quit.toLowerCase().equals("y")){
			
		} else if (quit.toLowerCase().equals("no") || quit.toLowerCase().equals("n")){ 
			factor(console); 
		}
	}
}

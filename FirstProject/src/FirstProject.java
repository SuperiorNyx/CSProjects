import java.util.*;
public class FirstProject {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		//int number = 0;
		System.out.println("Type a number from 1-100: ");
		checkMismatch(console);
		
	}
	public static void checkMismatch(Scanner console){

		int number = 0;
		boolean retry = true;
		do{
			try{
				number = Integer.parseInt(console.nextLine());
				if(number > 100 || number < 1){
					System.out.println("Please input a number between 1 and 100: ");
					number = console.nextInt();
					factor(console, number);
				} else {
					factor(console, number);
				}
				retry = true;
			} catch(NumberFormatException e){
				System.out.println("Only integer values allowed.");
				checkMismatch(console);
			
			}
		} while (!retry);
		
	}
	
	public static void factor(Scanner console, int number){
		
		
			for (int i = 1; i < number; i++){
				if(number % i == 0){
					System.out.print(i + " ");
				}
			}
			System.out.print(number);
			quit(console);
		
		
		
	}
	
	public static void quit(Scanner console){
		System.out.print("\nQuit? ");
		String quit = console.next();
		if(quit.toLowerCase().equals("quit") || quit.toLowerCase().equals("yes") || quit.toLowerCase().equals("y")){
			
		} else if (quit.toLowerCase().equals("no") || quit.toLowerCase().equals("n")){ 
			System.out.println("Type a number from 1-100: ");
			checkMismatch(console); 
		}
	}
}

import java.util.*;
public class FirstProject {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		boolean run = true;
		while(run){
			System.out.print("Type a number from 1-100: ");
			int number = checkMismatch(console, 0);
			System.out.print("Do you want to enter a second number? ");
			String yn = console.next();
			if(yn.substring(0,1).toLowerCase().equals("y")){
            System.out.print("Type a number from 1-100: ");
				int number2 = checkMismatch(console, 0);
            System.out.print("Greatest Common Divisor of " + number + " and " 
                                 + number2 + " is: " + gcd(number, number2));
            run = quit(console, run);
			} else {
				factor(number);
				run = quit(console, run);
			}
		} 
	}
	
	public static int checkMismatch(Scanner console, int number){
		try{
			number = Integer.parseInt(console.next());
			if(number > 100 || number < 1){
				System.out.print("Please input a number between 1 and 100: ");
				number = checkMismatch(console, number);
			} else {
				number = (int) number;
				return (int)number;
			}
		} catch(NumberFormatException e){
			System.out.print("Only integer values allowed. Please input a number between 1 and 100: ");
			number = checkMismatch(console, number);
		}
		return (int)number;
	}
	
	public static void factor(int number){
      System.out.print("Factors of " + number + ": ");
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
	
	public static boolean quit(Scanner console, boolean run){
		System.out.print("\nQuit? ");
		String quit = console.next();
		if(quit.substring(0,1).toLowerCase().equals("q") || quit.substring(0,1).toLowerCase().equals("y")){
			run = false;
			return run;
		} else if (quit.substring(0,1).toLowerCase().equals("n")){ 
			run = true;
			return run;
		}
		return run;
	}
}
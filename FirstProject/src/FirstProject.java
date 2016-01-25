import java.util.*;
public class FirstProject {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		boolean run = true;
		String stop = "";
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
				System.out.print("\nQuit? ");
				stop = console.next();
				run = quit(stop,run);
			} else {
				System.out.print(factor(number));
				System.out.print("\nQuit? ");
				stop = console.next();
				run = quit(stop,run);
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
				return number;
			}
		} catch(NumberFormatException e){
			System.out.print("Only integer values allowed. Please input a number between 1 and 100: ");
			number = checkMismatch(console, number);
		}
		return number;
	}
	
	public static String factor(int number){
		String factored = "Factors of " + number + ": ";
			for (int i = 1; i < number; i++){
				if(number % i == 0){
					factored += (i + " ");
				}
			}
		factored += (number);
		return factored;
	}
	
	public static int gcd(int number, int number2){
		int biggest = number;
		int smallest = number2;
		if(number2 > number){
			biggest = number2; 
			smallest = number; 
		}
		if(smallest==0){
			return biggest; 
		} else {
			return gcd(smallest, biggest%smallest);
		}
	}
	
	public static boolean quit(String quit, boolean run){		
		if(quit.substring(0,1).equalsIgnoreCase("q") || quit.substring(0,1).equalsIgnoreCase("y")){
			run = false;
			return run;
		} else if (quit.substring(0,1).equalsIgnoreCase("n")){
			return run;
		}
		return run;
	}
}
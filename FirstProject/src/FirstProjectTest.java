import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.internal.runners.TestMethod;

import junit.framework.Assert;

import java.util.*;

public class FirstProjectTest {

	//Tests if the factor() method is correct
	@Test
	public void testFactor() {
		Assert.assertEquals("Factors of 10: " + 1 + " " + 2 + " " + 5 + " " + 10, FirstProject.factor(10));
	}
	
	//Tests if the gcd() method is correct
	@Test
	public void testGCD(){
		Assert.assertEquals(5, FirstProject.gcd(10, 15));
	}	
	
	//Tests if the method quit will return the correct boolean for user input "yes"
	@Test
	public void testQuit(){
		boolean run = true;
		Assert.assertEquals(false, FirstProject.quit("y", run));
	
	}
	
	//Tests if checkMismatch() correctly recognizes and returns an int
	@Test
	public void testCheckInt(){
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the expected number: ");
		Assert.assertEquals(5, FirstProject.checkMismatch(console, 5));
	}
	
	//Tests if checkMismatch() correctly rejects anything other than an integer
	//Will fail once an int is entered into the console, but this means checkMismatch works correctly
	@Test
	public void testMismatch(){
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the expected number twice, then an int: ");
		Assert.assertEquals(-3, FirstProject.checkMismatch(console, -3));
	}
}
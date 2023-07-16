import java.util.*;
public class SumOfN {

	  public static void main(String[] args) {

		  sumOfN(5);
		  sumOfN(6);
	  }
	  public static void sumOfN(int n) {
	    int sum = 0;
	    for (int i = 1; i <= n; i++) {
	      sum += i;
	    }
	    System.out.println("The sum of the first " + n + " numbers is: " + sum);
	  }
	}



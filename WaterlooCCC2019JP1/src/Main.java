import java.util.Scanner;

public class Main {

	public static void main (String[] args)
	{					
		Scanner input = new Scanner(System.in);
		
		int appleTotal = 0;
		int bannanaTotal = 0;
		
		appleTotal += input.nextInt() * 3;
		appleTotal += input.nextInt() * 2;
		appleTotal += input.nextInt();
		
		
		bannanaTotal += input.nextInt() * 3;	
		bannanaTotal += input.nextInt() * 2;
		bannanaTotal += input.nextInt();
		
		
		
		if(appleTotal > bannanaTotal)
			System.out.println("A");
		else if(appleTotal < bannanaTotal)
			System.out.println("B");
		else
			System.out.println("T");
		
		
		
	}
	
}

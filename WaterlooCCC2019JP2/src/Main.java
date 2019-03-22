import java.util.Scanner;

public class Main {

	public static void main (String[] args)
	{					
		Scanner input = new Scanner(System.in);
		int l = input.nextInt();
		
		input.nextLine();
		
		String[] message = new String[l];
		String[] current = new String[2];
		
		for (int i = 0; i < l; i++) {			
			message[i] = input.nextLine();			
		}
		
		for (int k = 0; k < l; k++) 
		{
			current = message[k].split(" ");
			for(int c = 0; c < Integer.parseInt(current[0]); c++)
			{
				System.out.print(current[1]);
			}
			System.out.println();
		}
	}
	
}

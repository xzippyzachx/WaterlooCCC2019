import java.util.Scanner;

public class Main {

	public static void main (String[] args)
	{					
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		input.nextLine();
		
		String[] line = new String[n];
		String[] CurrentLine;
		
		for (int i = 0; i < n; i++) {			
			line[i] = input.nextLine();			
		}
		
		String last = "";
		int amount = 1;
		
		for(int l = 0; l < n; l++)
		{
			amount = 1;
			last = "";
			CurrentLine = line[l].split("");
			for(int c = 0; c < CurrentLine.length; c++)
			{
				if(c == 0)
				{
					last = CurrentLine[c];
				}
				else if(CurrentLine[c].equals(last))
				{
					amount++;
				}
				else
				{
					System.out.print(amount + " " + last + " ");
					last = CurrentLine[c];
					amount = 1;
				}
				
				if(c == CurrentLine.length -1)
				{
					System.out.print(amount + " " + last + " ");
				}
				
			}
			System.out.println();
		}
		
	}
}

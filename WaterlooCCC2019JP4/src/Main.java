import java.util.Scanner;

public class Main {

	public static void main (String[] args)
	{					
		Scanner input = new Scanner(System.in);
		String flipsInput = input.nextLine();
		
		String[] flips = flipsInput.split("");
		
		int[][] grid = new int [][]{{ 1, 2},{ 3, 4 }}; 
		
		for (int f = 0; f < flips.length; f++) {
			if(flips[f].equals("H"))
				grid = HFlip(grid);
			
			if(flips[f].equals("V"))
				grid = VFlip(grid);			
		}	
		
		System.out.println(grid[0][0]+ " " + grid[0][1]);
		System.out.println(grid[1][0]+ " " + grid[1][1]);
	}
	
	public static int[][] HFlip(int[][] _grid)
	{
		int[][] newGrid = new int [][]{{_grid[1][0], _grid[1][1]},{ _grid[0][0], _grid[0][1]}}; 
		return newGrid;		
	}
	
	public static int[][] VFlip(int[][] _grid)
	{
		int[][] newGrid = new int [][]{{_grid[0][1], _grid[0][0]},{ _grid[1][1], _grid[1][0]}}; 
		return newGrid;		
	}
}

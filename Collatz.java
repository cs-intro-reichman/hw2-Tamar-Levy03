// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		String mode = args[1];
		int num= 1;
		int counter = 1;
		int numOfPrint = 1;
		if (mode.equals("v")) {		
		for(int i = 0; i<n; i++)
		{
			numOfPrint = 1;
			num = counter;
			System.out.print(num + " ");
			do { 			
				if (num%2 != 0) {
					num = num*3 + 1;
					System.out.print(num + " ");
				}
				else{
					num = num/2;
					System.out.print(num + " ");
				}	
				numOfPrint++;		
			}while (num !=1);
			System.out.print("(" + numOfPrint + ")");
				System.out.println();
				++counter;
		}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
	}
		else{
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
			
	}
}

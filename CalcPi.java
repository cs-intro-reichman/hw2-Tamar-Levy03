// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double sum = 1;
		double counter = 3;
		int check = 0;
		for(int i = 0; i < num; i++ ){

			if (i%2 == 0) {
				if (check%2 == 0) {
					sum = sum - (1/counter);
				}
				else{
					sum = sum + (1/counter);

				}
				++check;
				counter=counter+2;
			}
		}
		System.out.println(sum*4);

	}
}

// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String cheers = args[0];
            int time = Integer.parseInt(args[1]);
            String upperCase = cheers.toUpperCase();
            String an = "AEFHILMNORSX";
            int i = 0;
            while (i < upperCase.length()) {
                char lettar = upperCase.charAt(i);
                if (an.indexOf(lettar) == -1) {
                        System.out.println("Give me a " + lettar + ": " + lettar + "!");
                }
                else{
                        System.out.println("Give me an " + lettar + ": " + lettar + "!");    
                }
                ++i;
                
            }

            i=0;
            System.out.println("What does that spell?");
            while (i<time) {
                System.out.println(upperCase +"!!!");
                ++i;
            }

        }
}

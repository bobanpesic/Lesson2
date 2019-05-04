package exercises;

/*
 * Count down a rocket launch!
 * 
 * Print the numbers from 10 to 1, then print Blastoff!
 */

    public class NASACountdown {
	public static void main(String[] args) {

		int i;

		NASACountdown cd = new NASACountdown();

		for (i = 10; i >= 0; i--) {
        System.out.println(i);

	    if (i == 1) {
		System.out.println("Blastoff!");
		break;

			}
		}

	}
}


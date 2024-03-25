package problem2;

public class FizzBuzz {
	private int fizzNumber;
	private int buzzNumber;
	
	public FizzBuzz(int fizzNumber, int buzzNumber) {
		this.fizzNumber= fizzNumber;
		this.buzzNumber = buzzNumber;
	}
	
	public void play(int start, int end) {
		int fizzCount = 0;
		int buzzCount = 0;
		int fizzBuzzCount = 0;
		
		
		for (int i = start; i <= end; i++) {
			if(i % fizzNumber == 0 && i % buzzNumber == 0) {
				System.out.println("FizzBuzz");
				fizzBuzzCount++;
			} else if (i % fizzNumber == 0) {
				System.out.println("Fizz");
				fizzCount++;
			} else if (i % buzzNumber == 0) {
				System.out.println("Buzz");
				buzzCount++;
			} else {
				System.out.println(i);
			}
		}
		
		System.out.println("FizzBuzz: " + fizzBuzzCount + " Fizz: " + fizzCount + " Buzz: " + buzzCount);
	}

}

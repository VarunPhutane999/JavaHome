package problem2;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Question1: ");
		FizzBuzz fizzBuzz1 = new FizzBuzz(3,5);
		fizzBuzz1.play(1, 11);
		
		System.out.println("Question: ");
		FizzBuzz fizzBuzz2 = new FizzBuzz(3,5);
		fizzBuzz2.play(10,25);
		
		System.out.println("Question: ");
		FizzBuzz fizzBuzz3 = new FizzBuzz(3,5);
		fizzBuzz3.play(90, 100);
	}

}

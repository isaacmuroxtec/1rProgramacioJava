
public class FizzBuzz {
	public static void main(String[] args) {
		// 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz
		
		int i = 1;
		while (i <= 100){
			if (i % 3 == 0 && i % 5 == 0){
				System.out.print("FizzBuzz ");
			} else if (i % 3 == 0){
				System.out.print("Fizz ");
			} else if (i % 5 == 0){
				System.out.print("Buzz ");
			} else {
				System.out.print(i + " ");
			}
			i = i + 1;
		}

	}

}

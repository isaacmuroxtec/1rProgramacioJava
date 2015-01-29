
public class Fibonacci {

	public static void main(String[] args) {
		// Declarar array
		int[] fibonacci = new int[30];
		int j = 0;
		
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		
		// ALGORISME!!!!!!!!!!!!!!!!!!!!!!!!!
		for (int i = 2; i < fibonacci.length; i ++){
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		
		
		while (j < fibonacci.length ){
			System.out.println(j + ":" +fibonacci[j]);
			j = j + 1;
		}

	}

}

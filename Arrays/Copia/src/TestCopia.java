
public class TestCopia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {6,5,4,8,3,9,2};
		int[] b = new int[a.length * 2];
		
		// IMPRIMIM ELS VALORS D'A
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
		
		// SI QUE FA LA COPIA
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		
		a = b;
		
		// IMPRIMIM ELS VALORS D'A
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}

}
